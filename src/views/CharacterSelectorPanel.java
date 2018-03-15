package views;

import items.boots.NoviceBoots;
import player.Character;
import player.character.DarkKnight;
import player.character.DarkWizard;
import player.character.Elf;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 */
public class CharacterSelectorPanel extends JPanel {
    /**
     *
     */
    private Character character;

    /**
     * @return Character
     */
    private Character getCharacter() {
        return this.character;
    }

    /**
     * @param character Character
     */
    public void setCharacter(Character character) {
        this.character = character;
    }

    /**
     *
     */
    public void unload() {
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        CharacterPanel panel = new CharacterPanel();
        panel.setCharacter(character);
        panel.create();

        topFrame.setContentPane(panel);
        topFrame.revalidate();
        topFrame.repaint();
    }

    /**
     *
     */
    public void create() {
        String[] types = {"Dark Wizard", "Dark Knight", "Elf"};
        JComboBox type = new JComboBox(types);
        add(type);

        JButton button = new JButton(new AbstractAction("Kiválaszt") {
            public void actionPerformed(ActionEvent e) {
                if ("Dark Wizard" == type.getSelectedItem()) {
                    setCharacter(new DarkWizard());
                } else if ("Dark Knight" == type.getSelectedItem()) {
                    setCharacter(new DarkKnight());
                } else if ("Elf" == type.getSelectedItem()) {
                    setCharacter(new Elf());
                } else {
                    return;
                }

                try {
                    getCharacter().getBag().addItem(new NoviceBoots(100));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                unload();
            }
        });
        add(button);
    }
}
