package mission.enemies;

/**
 *
 */
public class Dragon extends Enemy {
    /**
     * {@inheritDoc}
     */
    public int getWinningRate() {
        return this.level * (this.energy * 4 + this.strength * 3 + this.stamina * 2 + this.agility);
    }

    /**
     * @param level int
     */
    public Dragon(int level) {
        super(level);
    }
}
