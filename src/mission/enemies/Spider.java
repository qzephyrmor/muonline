package mission.enemies;

/**
 *
 */
public class Spider extends Enemy {
    /**
     * @return int
     */
    public int getWinningRate() {
        return this.level * (this.agility * 4 + this.strength * 3 + this.stamina * 2 + this.energy);
    }

    /**
     * @param level int
     */
    public Spider(int level) {
        super(level);
    }
}
