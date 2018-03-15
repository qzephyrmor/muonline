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

    public int getStrength() {
        return this.strength;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getStamina() {
        return this.stamina;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getLevel() {
        return this.level;
    }
    /**
     * @param level int
     */
    public Enemy(int level) {
        this.level = level;
    }
}
