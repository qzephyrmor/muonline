package mission.enemies;

/**
 *
 */
abstract class Enemy implements EnemyInterface {
    /**
     * @return int
     */
    abstract public int getWinningRate();

    /**
     *
     */
    int strength;

    /**
     *
     */
    int agility;

    /**
     *
     */
    int stamina;

    /**
     *
     */
    int energy;

    /**
     *
     */
    int level;

    /**
     * @param level int
     */
    public Enemy(int level) {
        this.level = level;
    }
}
