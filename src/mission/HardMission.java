package mission;

import mission.enemies.Dragon;
import mission.enemies.EnemyInterface;
import player.Character;

/**
 *
 */
public class HardMission extends Mission {
    /**
     * @return EnemyInterface
     */
    public EnemyInterface getEnemy() {
        return new Dragon(this.character.getLevel() + 5);
    }

    /**
     * @param character Character
     */
    public HardMission(Character character) {
        super(character);
    }
}
