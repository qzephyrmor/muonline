package mission;

import items.AbstractItem;
import items.ItemInterface;
import mission.enemies.EnemyInterface;
import player.Character;

import javax.swing.*;
import java.util.HashSet;

/**
 *
 */
abstract class Mission implements MissionInterface{
    /**
     * @return EnemyInterface
     */
    abstract public EnemyInterface getEnemy();

    /**
     *
     */
    protected Character character;

    /**
     *
     */
    protected boolean win = false;

    /**
     *
     */
    protected int experience = 0;

    /**
     * @return int
     */
    public int getExperience() {
        return this.experience;
    }

    /**
     * @return boolean
     */
    public boolean isWin() {
        return this.win;
    }

    /**
     * @param character Character
     */
    public Mission(Character character) {
        this.character = character;
    }

    /**
     * @param minimum int
     * @param maximum int
     * @return int
     */
    int generateRandom(int minimum, int maximum) {
        return minimum + (int) (Math.random() * ((maximum - minimum) + 1));
    }

    /**
     *
     */
    public boolean fight() {
        float characterWinning = (float) character.getWinningPoints();
        float enemyWinning = (float) this.getEnemy().getWinningRate();
        int rand = (int) (Math.random() * (100 + 1));

        double chance = (characterWinning / (characterWinning + enemyWinning)) * 100;

        boolean win;

        if (rand < chance) {
            win = true;

            if (generateRandom(0, 100) > 40) {
                HashSet<Class> items = AbstractItem.getItems();
                int index = generateRandom(0, items.size() - 1);
                Class itemClass = (Class) items.toArray()[index];

                try {
                    int itemLevel = Math.max(0, getEnemy().getLevel() * 5);
                    ItemInterface item = (ItemInterface) Class
                        .forName(itemClass.getName())
                        .getConstructor(int.class)
                        .newInstance(itemLevel);

                    character.getBag().addItem(item);

                    JOptionPane.showMessageDialog(
                        null,
                        "You have been received a new item: " + item.getName() + " (Lv. " + itemLevel + ")",
                        "New item alert",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            win = false;
            character.setLifePoint(character.getLifePoint() - 1);
        }

        this.win = win;
        return win;
    }
}
