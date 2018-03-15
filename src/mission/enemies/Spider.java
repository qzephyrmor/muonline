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
     * @param maximum int
     * @return int
     */
    private int generateRandomPoints(int maximum) {
        return (int) (Math.random() * (maximum + 1));
    }

    /**
     * @param level int
     */
    public Spider(int level) {
        super(level);

        int points = level * 5 + 20;
        int rand = generateRandomPoints(points);
        points -= rand;
        this.strength = rand;

        rand = generateRandomPoints(points);
        points -= rand;
        this.agility = rand;

        rand = generateRandomPoints(points);
        points -= rand;
        this.stamina = rand;

        this.energy = points;
    }
}
