package mission;

import mission.enemies.EnemyInterface;

/**
 *
 */
public interface MissionInterface {
    /**
     * @return EnemyInterface
     */
    abstract public EnemyInterface getEnemy();

    /**
     * @return boolean
     */
    public boolean isWin();

    /**
     * @return int
     */
    public int getExperience();
}
