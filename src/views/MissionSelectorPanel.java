package views;

import mission.EasyMission;
import mission.HardMission;
import mission.MediumMission;
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

    /**
     *
     */
    public void create() {
        String[] difficults = {"Easy", "Medium", "Hard"};
        JComboBox box = new JComboBox(difficults);
        add(box);

        JButton button = new JButton(new AbstractAction("Indulás") {
            public void actionPerformed(ActionEvent e) {
                if (box.getSelectedItem() == "Easy") {
                    EasyMission mission = new EasyMission(character);
                    mission.fight();
                } else if (box.getSelectedItem() == "Medium") {
                    MediumMission mission = new MediumMission(character);
                    mission.fight();
                } else if (box.getSelectedItem() == "Hard") {
                    HardMission mission = new HardMission(character);
                    mission.fight();
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
