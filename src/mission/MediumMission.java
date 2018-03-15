package mission;

import mission.enemies.EnemyInterface;
import mission.enemies.Spider;
import player.Character;

/**
 *
 */
public class MediumMission extends Mission {
    /**
     * @return EnemyInterface
     */
    public EnemyInterface getEnemy() {
        return new Spider(this.character.getLevel());
    }

    /**
     * @param character Character
     */
    public MediumMission(Character character) {
        super(character);
    }
}
