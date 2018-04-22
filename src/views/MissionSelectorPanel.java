package views;

import mission.EasyMission;
import mission.HardMission;
import mission.MediumMission;
import mission.MissionInterface;
import player.Character;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 */
public class MissionSelectorPanel extends JPanel {
    protected Character character;

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

    private void showMissionDetails(MissionInterface mission) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        MissionDetailPanel panel = new MissionDetailPanel();
        panel.setCharacter(character);
        panel.setMission(mission);
        panel.create();
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }
    /**
     *
     */
    public void create() {
        String[] difficulties = {"Easy", "Medium", "Hard"};
        JComboBox<String> box = new JComboBox<>();

        for (String difficulty: difficulties) {
            box.addItem(difficulty);
        }

        add(box);

        JButton button = new JButton(new AbstractAction("Indulás") {
            public void actionPerformed(ActionEvent e) {
                if (box.getSelectedItem() == "Easy") {
                    EasyMission mission = new EasyMission(character);
                    mission.fight();

                    showMissionDetails(mission);
                } else if (box.getSelectedItem() == "Medium") {
                    MediumMission mission = new MediumMission(character);
                    mission.fight();

                    showMissionDetails(mission);
                } else if (box.getSelectedItem() == "Hard") {
                    HardMission mission = new HardMission(character);
                    mission.fight();

                    showMissionDetails(mission);
                }
            }
        });

        add(button);

        add(new JButton(new AbstractAction("Back") {
            @Override
            public void actionPerformed(ActionEvent e) {
                unload();
            }
        }));
    }
}
