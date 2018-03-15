package mission;

import mission.enemies.EnemyInterface;
import mission.enemies.Spider;
import player.Character;

/**
 *
 */
public class EasyMission extends Mission {
    /**
     * @return EnemyInterface
     */
    public EnemyInterface getEnemy() {
        return new Spider(Math.max(1, this.character.getLevel() - 5));
    }

    /**
     * @param character Character
     */
    public EasyMission(Character character) {
        super(character);
    }
}
