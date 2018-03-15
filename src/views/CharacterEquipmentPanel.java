package views;

import player.Character;
import player.Equipment;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CharacterEquipmentPanel extends JPanel {
    private Character character;

    public void setCharacter(Character character) {
        this.character = character;
    }

    private void unload() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        CharacterPanel panel = new CharacterPanel();
        panel.setCharacter(character);
        panel.create();
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }

    private void createHelmetRow(JPanel bagPanel, Equipment equipment) {
        bagPanel.add(new JLabel("Helmet"));
        bagPanel.add(new JLabel(
            equipment.getHelmet() != null
                ? equipment.getHelmet().getName()
                : "No helmet equipped"
        ));
        bagPanel.add(new JLabel(
            equipment.getHelmet() != null
                ? "+" + equipment.getHelmet().getStrength() + " strength"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getHelmet() != null
                ? "+" + equipment.getHelmet().getAgility() + " agility"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getHelmet() != null
                ? "+" + equipment.getHelmet().getStamina() + " stamina"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getHelmet() != null
                ? "+" + equipment.getHelmet().getEnergy() + " energy"
                : ""
        ));

        if (equipment.getHelmet() != null) {
            bagPanel.add(new JButton(new AbstractAction("Unequip") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    character.unequip(equipment.getHelmet());
                }
            }));
        } else {
            bagPanel.add(new JLabel(""));
        }
    }

    private void createChestRow(JPanel bagPanel, Equipment equipment) {
        bagPanel.add(new JLabel("Chest"));
        bagPanel.add(new JLabel(
            equipment.getChest() != null
                ? equipment.getChest().getName()
                : "No chest equipped"
        ));
        bagPanel.add(new JLabel(
            equipment.getChest() != null
                ? "+" + equipment.getChest().getStrength() + " strength"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getChest() != null
                ? "+" + equipment.getChest().getAgility() + " agility"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getChest() != null
                ? "+" + equipment.getChest().getStamina() + " stamina"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getChest() != null
                ? "+" + equipment.getChest().getEnergy() + " energy"
                : ""
        ));

        if (equipment.getChest() != null) {
            bagPanel.add(new JButton(new AbstractAction("Unequip") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    character.unequip(equipment.getChest());
                }
            }));
        } else {
            bagPanel.add(new JLabel(""));
        }
    }

    private void createBootsRow(JPanel bagPanel, Equipment equipment) {
        bagPanel.add(new JLabel("Boots"));
        bagPanel.add(new JLabel(
            equipment.getBoots() != null
                ? equipment.getBoots().getName()
                : "No boots equipped"
        ));
        bagPanel.add(new JLabel(
            equipment.getBoots() != null
                ? "+" + equipment.getBoots().getStrength() + " strength"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getBoots() != null
                ? "+" + equipment.getBoots().getAgility() + " agility"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getBoots() != null
                ? "+" + equipment.getBoots().getStamina() + " stamina"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getBoots() != null
                ? "+" + equipment.getBoots().getEnergy() + " energy"
                : ""
        ));

        if (equipment.getBoots() != null) {
            bagPanel.add(new JButton(new AbstractAction("Unequip") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    character.unequip(equipment.getBoots());
                }
            }));
        } else {
            bagPanel.add(new JLabel(""));
        }
    }

    private void createGlovesRow(JPanel bagPanel, Equipment equipment) {
        bagPanel.add(new JLabel("Gloves"));
        bagPanel.add(new JLabel(
            equipment.getGloves() != null
                ? equipment.getGloves().getName()
                : "No gloves equipped"
        ));
        bagPanel.add(new JLabel(
            equipment.getGloves() != null
                ? "+" + equipment.getGloves().getStrength() + " strength"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getGloves() != null
                ? "+" + equipment.getGloves().getAgility() + " agility"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getGloves() != null
                ? "+" + equipment.getGloves().getStamina() + " stamina"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getGloves() != null
                ? "+" + equipment.getGloves().getEnergy() + " energy"
                : ""
        ));

        if (equipment.getGloves() != null) {
            bagPanel.add(new JButton(new AbstractAction("Unequip") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    character.unequip(equipment.getGloves());
                }
            }));
        } else {
            bagPanel.add(new JLabel(""));
        }
    }

    private void createWeaponRow(JPanel bagPanel, Equipment equipment) {
        bagPanel.add(new JLabel("Weapon"));
        bagPanel.add(new JLabel(
            equipment.getWeapon() != null
                ? equipment.getWeapon().getName()
                : "No weapon equipped"
        ));
        bagPanel.add(new JLabel(
            equipment.getWeapon() != null
                ? "+" + equipment.getWeapon().getStrength() + " strength"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getWeapon() != null
                ? "+" + equipment.getWeapon().getAgility() + " agility"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getWeapon() != null
                ? "+" + equipment.getWeapon().getStamina() + " stamina"
                : ""
        ));
        bagPanel.add(new JLabel(
            equipment.getWeapon() != null
                ? "+" + equipment.getWeapon().getEnergy() + " energy"
                : ""
        ));

        if (equipment.getWeapon() != null) {
            bagPanel.add(new JButton(new AbstractAction("Unequip") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    character.unequip(equipment.getWeapon());
                }
            }));
        } else {
            bagPanel.add(new JLabel(""));
        }
    }

    public void create() {
        JPanel bagPanel = new JPanel(new GridLayout(5, 7));
        Border bagBorder = BorderFactory.createTitledBorder("Equipment");
        bagPanel.setBorder(bagBorder);

        Equipment equipment = character.getEquipment();

        this.createWeaponRow(bagPanel, equipment);
        this.createHelmetRow(bagPanel, equipment);
        this.createChestRow(bagPanel, equipment);
        this.createBootsRow(bagPanel, equipment);
        this.createGlovesRow(bagPanel, equipment);

        add(bagPanel);
        add(new JButton(new AbstractAction("Back") {
            @Override
            public void actionPerformed(ActionEvent e) {
                unload();
            }
        }));
    }
}
