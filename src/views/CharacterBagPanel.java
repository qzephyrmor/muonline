package views;

import items.ItemInterface;
import player.Bag;
import player.Character;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CharacterBagPanel extends JPanel {
    private Character character;

    private Character getCharacter() {
        return this.character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public JFrame getFrame() {
        return (JFrame) SwingUtilities.getWindowAncestor(this);
    }

    public void create() {
        Bag bag = character.getBag();

        JPanel bagPanel = new JPanel(new GridLayout(bag.getItems().size() + 1, 4));
        Border bagBorder = BorderFactory.createTitledBorder("Bag (" + bag.getItems().size() + "/20)");
        bagPanel.setBorder(bagBorder);

        bagPanel.add(new JLabel("Item Type"));
        bagPanel.add(new JLabel("Item Name"));
        bagPanel.add(new JLabel(""));
        bagPanel.add(new JLabel(""));

        for (ItemInterface item: bag.getItems()) {
            bagPanel.add(new JLabel(item.getType()));
            bagPanel.add(new JLabel(item.getName()));
            bagPanel.add(new JButton(new AbstractAction("Equip") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    character.equip(item);
                    bagPanel.revalidate();
                    bagPanel.repaint();
                }
            }));
            bagPanel.add(new JButton(new AbstractAction("Drop") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    bag.dropItem(item);
                    getFrame().revalidate();
                    getFrame().repaint();
                }
            }));
        }

        add(bagPanel);
    }
}
