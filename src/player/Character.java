package player;

import items.ItemInterface;
import items.boots.BootsInterface;
import items.chests.ChestsInterface;
import items.helmets.HelmetInterface;

/**
 *
 */
abstract public class Character {
    /**
     * @return String
     */
    abstract public String getName();

    /**
     * Táska
     */
    private Bag bag = new Bag();

    /**
     * Felszerelés
     */
    private Equipment equipment = new Equipment();

    /**
     * Erő
     */
    private int strength = 0;

    /**
     * Ügyesség
     */
    private int agility = 0;

    /**
     * Állóképesség
     */
    private int stamina = 0;

    /**
     * Energia
     */
    private int energy = 0;

    /**
     * Életpont
     */
    private int lifePoint = 5;

    /**
     * Szint
     */
    private int level = 1;

    /**
     * @return int
     */
    public int getStrength() {
        return this.strength;
    }

    /**
     * @param strength int
     */
    public void addStrength(int strength) {
        this.strength += strength;
    }

    /**
     * @return int
     */
    public int getAgility() {
        return this.agility;
    }

    /**
     * @param agility int
     */
    public void addAgility(int agility) {
        this.agility += agility;
    }

    /**
     * @return int
     */
    public int getStamina() {
        return this.stamina;
    }

    /**
     * @param stamina int
     */
    public void addStamina(int stamina) {
        this.stamina += stamina;
    }

    /**
     * @return int
     */
    public int getEnergy() {
        return this.energy;
    }

    /**
     * @param energy int
     */
    public void addEnergy(int energy) {
        this.energy += energy;
    }

    /**
     * @return Bag
     */
    public Bag getBag() {
        return this.bag;
    }

    /**
     * @return Equipment
     */
    public Equipment getEquipment() {
        return this.equipment;
    }

    /**
     * @return int
     */
    public int getLifePoint() {
        return lifePoint;
    }

    /**
     * @param lifePoint int
     */
    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    /**
     * @return int
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level int
     */
    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {

    }

    /**
     * @param item ItemInterface
     */
    public void equip(ItemInterface item) {
        if (item instanceof HelmetInterface) {
            this.getBag().getItems().remove(item);
            this.getEquipment().equipHelmet((HelmetInterface) item);
        } else if (item instanceof ChestsInterface) {
            this.getBag().getItems().remove(item);
            this.getEquipment().equipChest((ChestsInterface) item);
        } else if (item instanceof BootsInterface) {
            this.getBag().getItems().remove(item);
            this.getEquipment().equipBoots((BootsInterface) item);
        }
    }
}
