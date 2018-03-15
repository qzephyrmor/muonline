package mission.enemies;

/**
 *
 */
public class Bull extends Enemy {
    /**
     * {@inheritDoc}
     */
    public int getWinningRate() {
        return this.level * (this.strength * 4 + this.agility * 3 + this.stamina * 2 + this.energy);
    }

    /**
     * @param level int
     */
    public Bull(int level) {
        super(level);
    }
}
