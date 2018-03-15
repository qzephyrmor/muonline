package mission;

import mission.enemies.EnemyInterface;
import player.Character;

/**
 *
 */
abstract class Mission {
    /**
     * @return EnemyInterface
     */
    abstract public EnemyInterface getEnemy();

    /**
     *
     */
    protected Character character;

    /**
     * @param character Character
     */
    public Mission(Character character) {
        this.character = character;
    }

    /**
     *
     */
    public void fight() {

    }
}
