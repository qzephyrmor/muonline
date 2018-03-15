package views;

import player.Character;
import player.Equipment;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

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

    /**
     *
     */
    public void create() {
        setLayout(new GridLayout(2, 1));

        JPanel panel = new JPanel(new GridLayout(3, 2));
        Border border = BorderFactory.createTitledBorder("Character");
        panel.setBorder(border);

        panel.add(new JLabel("Character type: "));
        panel.add(new JLabel("" + character.getName()));

        panel.add(new JLabel("Level: "));
        panel.add(new JLabel("" + character.getLevel()));

        panel.add(new JLabel("Life points: "));
        panel.add(new JLabel("" + character.getLifePoint()));

        JPanel properties = new JPanel(new GridLayout(4, 2));
        Border propertiesBorder = BorderFactory.createTitledBorder("Properties");
        properties.setBorder(propertiesBorder);

        properties.add(new JLabel("Strength: "));
        properties.add(new JLabel("" + character.getStrength()));

        properties.add(new JLabel("Agility: "));
        properties.add(new JLabel("" + character.getAgility()));

        properties.add(new JLabel("Stamina: "));
        properties.add(new JLabel("" + character.getStamina()));

        properties.add(new JLabel("Energy: "));
        properties.add(new JLabel("" + character.getEnergy()));

        add(panel);
        add(properties);

        add(new JButton(new AbstractAction("Equipment") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Character equipment");
                CharacterEquipmentPanel panel = new CharacterEquipmentPanel();
                panel.setCharacter(character);
                panel.create();
                frame.add(panel);
                frame.setSize(800, 300);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        }));

        add(new JButton(new AbstractAction("Bag") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Character bag");
                CharacterBagPanel panel = new CharacterBagPanel();
                panel.setCharacter(character);
                panel.create();
                frame.add(panel);
                frame.setSize(800, 300);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        }));
    }
}
