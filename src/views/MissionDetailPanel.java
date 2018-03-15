package views;

import mission.MissionInterface;
import player.Character;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 */
public class MissionDetailPanel extends JPanel {
    /**
     *
     */
    private Character character;

    /**
     *
     */
    private MissionInterface mission;

    /**
     * @param character Character
     */
    public void setCharacter(Character character) {
        this.character = character;
    }

    /**
     * @param mission MissionInterface
     */
    public void setMission(MissionInterface mission) {
        this.mission = mission;
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

    /**
     *
     */
    public void create() {
        JPanel overviewPanel = new JPanel(new GridLayout(5, 2));
        Border overviewBorder = BorderFactory.createTitledBorder("Overview");
        overviewPanel.setBorder(overviewBorder);

        overviewPanel.add(new JLabel("Win: "));
        overviewPanel.add(new JLabel(mission.isWin() ? "Yes" : "No"));

        overviewPanel.add(new JLabel("Experience: "));
        overviewPanel.add(new JLabel(mission.getExperience() + ""));

        JPanel enemyPanel = new JPanel(new GridLayout(6, 2));
        Border enemyBorder = BorderFactory.createTitledBorder("Enemy");
        enemyPanel.setBorder(enemyBorder);

        enemyPanel.add(new JLabel("Level: "));
        enemyPanel.add(new JLabel("Lv. " + mission.getEnemy().getLevel()));

        enemyPanel.add(new JLabel("Strength: "));
        enemyPanel.add(new JLabel("" + mission.getEnemy().getStrength()));

        enemyPanel.add(new JLabel("Agility: "));
        enemyPanel.add(new JLabel("" + mission.getEnemy().getAgility()));

        enemyPanel.add(new JLabel("Stamina: "));
        enemyPanel.add(new JLabel("" + mission.getEnemy().getStamina()));

        enemyPanel.add(new JLabel("Energy: "));
        enemyPanel.add(new JLabel("" + mission.getEnemy().getEnergy()));

        enemyPanel.add(new JLabel("Win rate: "));
        enemyPanel.add(new JLabel("" + mission.getEnemy().getWinningRate()));

        JPanel characterPanel = new JPanel(new GridLayout(6, 2));
        Border characterBorder = BorderFactory.createTitledBorder("Character");
        characterPanel.setBorder(characterBorder);

        characterPanel.add(new JLabel("Level: "));
        characterPanel.add(new JLabel("Lv. " + character.getLevel()));

        characterPanel.add(new JLabel("Strength: "));
        characterPanel.add(new JLabel("" + character.getDirtyStrength() + " (+" + character.getEquipment().getStrength() + ")"));

        characterPanel.add(new JLabel("Agility: "));
        characterPanel.add(new JLabel("" + character.getDirtyAgility() + " (+" + character.getEquipment().getAgility() + ")"));

        characterPanel.add(new JLabel("Stamina: "));
        characterPanel.add(new JLabel("" + character.getDirtyStamina() + " (+" + character.getEquipment().getStamina() + ")"));

        characterPanel.add(new JLabel("Energy: "));
        characterPanel.add(new JLabel("" + character.getDirtyEnergy() + " (+" + character.getEquipment().getEnergy() + ")"));

        characterPanel.add(new JLabel("Win rate: "));
        characterPanel.add(new JLabel("" + character.getWinningPoints()));

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(overviewPanel);
        panel.add(enemyPanel);
        panel.add(characterPanel);

        add(panel);

        add(new JButton(new AbstractAction("Back") {
            @Override
            public void actionPerformed(ActionEvent e) {
                unload();
            }
        }));
    }
}
