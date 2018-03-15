package items;

/**
 *
 */
abstract public class AbstractItem {
    private int strength;

    private int agility;

    private int stamina;

    private int energy;

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getStamina() {
        return stamina;
    }

    public int getEnergy() {
        return energy;
    }

    /**
     * @param maximum int
     * @return int
     */
    private int generateRandomPoints(int maximum) {
        return (int) (Math.random() * (maximum + 1));
    }

    /**
     *
     */
    public AbstractItem(int points) {
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
