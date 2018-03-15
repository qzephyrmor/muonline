package player;

import items.boots.BootsInterface;
import items.chests.ChestsInterface;
import items.gloves.GlovesInterface;
import items.helmets.HelmetInterface;
import items.weapons.WeaponsInterface;

/**
 *
 */
public class Equipment {
    private HelmetInterface helmet;

    private ChestsInterface chest;

    private BootsInterface boots;

    private GlovesInterface gloves;

    private WeaponsInterface weapon;

    public HelmetInterface getHelmet() {
        return this.helmet;
    }

    public void equipHelmet(HelmetInterface helmet) {
        this.helmet = helmet;
    }

    public void unequipHelmet(HelmetInterface helmet) {
        this.helmet = null;
    }

    public ChestsInterface getChest() {
        return this.chest;
    }

    public void equipChest(ChestsInterface chest) {
        this.chest = chest;
    }

    public void unequipChest(ChestsInterface chest) {
        this.chest = null;
    }

    public BootsInterface getBoots() {
        return this.boots;
    }

    public void equipBoots(BootsInterface boots) {
        this.boots = boots;
    }

    public void unequipBoots(BootsInterface boots) {
        this.boots = null;
    }

    public GlovesInterface getGloves() {
        return this.gloves;
    }

    public void equipGloves(GlovesInterface gloves) {
        this.gloves = gloves;
    }

    public void unequipGloves(GlovesInterface gloves) {
        this.gloves = null;
    }

    public WeaponsInterface getWeapon() {
        return this.weapon;
    }

    public void equipWeapon(WeaponsInterface weapon) {
        this.weapon = weapon;
    }

    public void unequipWeapon(WeaponsInterface weapon) {
        this.weapon = null;
    }

    /**
     * @return int
     */
    public int getStrength() {
        int sum = 0;
        sum += getHelmet() != null ? getHelmet().getStrength() : 0;
        sum += getChest() != null ? getChest().getStrength() : 0;
        sum += getBoots() != null ? getBoots().getStrength() : 0;
        sum += getGloves() != null ? getGloves().getStrength() : 0;
        sum += getWeapon() != null ? getWeapon().getStrength() : 0;
        return sum;
    }

    /**
     * @return int
     */
    public int getAgility() {
        int sum = 0;
        sum += getHelmet() != null ? getHelmet().getAgility() : 0;
        sum += getChest() != null ? getChest().getAgility() : 0;
        sum += getBoots() != null ? getBoots().getAgility() : 0;
        sum += getGloves() != null ? getGloves().getAgility() : 0;
        sum += getWeapon() != null ? getWeapon().getAgility() : 0;
        return sum;
    }

    /**
     * @return int
     */
    public int getStamina() {
        int sum = 0;
        sum += getHelmet() != null ? getHelmet().getStamina() : 0;
        sum += getChest() != null ? getChest().getStamina() : 0;
        sum += getBoots() != null ? getBoots().getStamina() : 0;
        sum += getGloves() != null ? getGloves().getStamina() : 0;
        sum += getWeapon() != null ? getWeapon().getStamina() : 0;
        return sum;
    }

    /**
     * @return int
     */
    public int getEnergy() {
        int sum = 0;
        sum += getHelmet() != null ? getHelmet().getEnergy() : 0;
        sum += getChest() != null ? getChest().getEnergy() : 0;
        sum += getBoots() != null ? getBoots().getEnergy() : 0;
        sum += getGloves() != null ? getGloves().getEnergy() : 0;
        sum += getWeapon() != null ? getWeapon().getEnergy() : 0;
        return sum;
    }
}
