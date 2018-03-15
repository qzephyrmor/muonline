package views;

import player.Character;
import player.Equipment;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 */
public class CharacterPanel extends JPanel {
    private Character character;

    private Character getCharacter() {
        return this.character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    private void showEquipment() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        CharacterEquipmentPanel panel = new CharacterEquipmentPanel();
        panel.setCharacter(character);
        panel.create();
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }

    private void showBag() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        CharacterBagPanel panel = new CharacterBagPanel();
        panel.setCharacter(character);
        panel.create();
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }

    private void showMissions() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        MissionSelectorPanel panel = new MissionSelectorPanel();
        panel.setCharacter(character);
        panel.create();
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }

    /**
     *
     */
    public void create() {
        setLayout(new GridLayout(3, 1));

        JPanel panel = new JPanel(new GridLayout(3, 2));
        Border border = BorderFactory.createTitledBorder("Character");
        panel.setBorder(border);

        panel.add(new JLabel("Character type: "));
        panel.add(new JLabel("" + character.getName()));

        panel.add(new JLabel("Level: "));
        panel.add(new JLabel("Lv. " + character.getLevel() + " (" + character.getExperience() + "%)"));

        panel.add(new JLabel("Life points: "));
        panel.add(new JLabel("" + character.getLifePoint()));

        JPanel properties = new JPanel(new GridLayout(4, 2));
        Border propertiesBorder = BorderFactory.createTitledBorder("Properties");
        properties.setBorder(propertiesBorder);

        properties.add(new JLabel("Strength: "));
        properties.add(new JLabel("" + character.getDirtyStrength() + " (+" + character.getEquipment().getStrength() + ")"));

        properties.add(new JLabel("Agility: "));
        properties.add(new JLabel("" + character.getDirtyAgility() + " (+" + character.getEquipment().getAgility() + ")"));

        properties.add(new JLabel("Stamina: "));
        properties.add(new JLabel("" + character.getDirtyStamina() + " (+" + character.getEquipment().getStamina() + ")"));

        properties.add(new JLabel("Energy: "));
        properties.add(new JLabel("" + character.getDirtyEnergy() + " (+" + character.getEquipment().getEnergy() + ")"));

        JPanel actionsPanel = new JPanel(new GridLayout(1, 2));
        Border actionsBorder = BorderFactory.createTitledBorder("Actions");
        actionsPanel.setBorder(actionsBorder);

        actionsPanel.add(new JButton(new AbstractAction("Equipment") {
            @Override
            public void actionPerformed(ActionEvent e) {
                showEquipment();
            }
        }));

        actionsPanel.add(new JButton(new AbstractAction("Bag") {
            @Override
            public void actionPerformed(ActionEvent e) {
                showBag();
            }
        }));

        actionsPanel.add(new JButton(new AbstractAction("Go to mission") {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMissions();
            }
        }));

        add(panel);
        add(properties);
        add(actionsPanel);
    }
}
