import player.Character;
import views.CharacterSelectorPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class Main {
    Character character;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mu Online");
        frame.setSize(400, 450);
        frame.setLayout(new GridLayout(3, 1));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("File");

        JMenuItem newItem = new JMenuItem(new AbstractAction("New") {
            @Override
            public void actionPerformed(ActionEvent e) {
                CharacterSelectorPanel panel = new CharacterSelectorPanel();
                panel.create();
                frame.setContentPane(panel);
                frame.revalidate();
                frame.repaint();
            }
        });
        menu.add(newItem);

        JMenuItem loadItem = new JMenuItem("Load");
        menu.add(loadItem);

        JMenuItem saveItem = new JMenuItem("Save");
        menu.add(saveItem);

        JMenuItem exitItem = new JMenuItem(new AbstractAction("Exit") {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        menu.addSeparator();
        menu.add(exitItem);

        bar.add(menu);

        frame.setJMenuBar(bar);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
