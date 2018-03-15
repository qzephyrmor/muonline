package mission.enemies;

/**
 *
 */
public interface EnemyInterface {
    /**
     * @return int
     */
    abstract public int getWinningRate();

    public int getStrength();

    public int getAgility();

    public int getStamina();

    public int getEnergy();

    public int getLevel();
}
