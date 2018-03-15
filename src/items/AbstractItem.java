package items;

import items.boots.NoviceBoots;
import items.chests.DragonChest;
import items.gloves.BronzeGloves;
import items.helmets.BrassHelmet;
import items.weapons.bows.Crossbow;
import items.weapons.rods.LegendaryRods;
import items.weapons.swords.KatanaSword;

import java.util.HashMap;
import java.util.HashSet;

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

    private static HashSet<Class> items = new HashSet<>();

    /**
     * @return HashMap<String, Class>
     */
    public static HashSet<Class> getItems() {
        return items;
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
        items.add(NoviceBoots.class);
        items.add(DragonChest.class);
        items.add(BronzeGloves.class);
        items.add(BrassHelmet.class);
        items.add(Crossbow.class);
        items.add(LegendaryRods.class);
        items.add(KatanaSword.class);

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
