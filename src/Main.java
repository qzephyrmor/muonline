import player.Character;
import views.AboutPanel;
import views.CharacterSelectorPanel;
import views.MissionSelectorPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class Main {
    Character character;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mu Online");
        frame.setSize(1000, 600);
        frame.setLayout(new GridLayout(3, 1));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("File");
        JMenu help = new JMenu("Help");

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

        JMenuItem aboutItem = new JMenuItem(new AbstractAction("About") {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("About");
                frame.setResizable(false);
                AboutPanel panel = new AboutPanel();
                panel.create();
                frame.add(panel);
                frame.setSize(350, 300);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });

        menu.addSeparator();
        menu.add(exitItem);

        help.add(aboutItem);

        bar.add(menu);
        bar.add(help);

        frame.setJMenuBar(bar);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
