package mission;

import mission.enemies.EnemyInterface;
import player.Character;

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
//        System.out.println(rand);
//        System.out.println(chance);

        boolean win;

        if (rand < chance) {
            win = true;
        } else {
            win = false;
            character.setLifePoint(character.getLifePoint() - 1);
        }

        this.win = win;
        return win;
    }
}
