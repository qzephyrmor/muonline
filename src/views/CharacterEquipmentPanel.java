package views;

import player.Character;
import player.Equipment;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CharacterEquipmentPanel extends JPanel {
    private Character character;

    public void setCharacter(Character character) {
        this.character = character;
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
    }

    public void create() {
        JPanel bagPanel = new JPanel(new GridLayout(5, 6));
        Border bagBorder = BorderFactory.createTitledBorder("Equipment");
        bagPanel.setBorder(bagBorder);

        Equipment equipment = character.getEquipment();

        this.createWeaponRow(bagPanel, equipment);
        this.createHelmetRow(bagPanel, equipment);
        this.createChestRow(bagPanel, equipment);
        this.createBootsRow(bagPanel, equipment);
        this.createGlovesRow(bagPanel, equipment);

        add(bagPanel);
    }
}
