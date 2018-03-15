package player;

import items.ItemInterface;
import items.boots.BootsInterface;
import items.chests.ChestsInterface;
import items.gloves.GlovesInterface;
import items.helmets.HelmetInterface;
import items.weapons.WeaponsInterface;

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
     * Tapasztalati pont
     */
    private int experience = 0;

    /**
     * @return int
     */
    public int getStrength() {
        return this.strength + this.getEquipment().getStrength();
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
    public int getDirtyStrength() {
        return this.strength;
    }

    /**
     * @return int
     */
    public int getAgility() {
        return this.agility + this.getEquipment().getAgility();
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
    public int getDirtyAgility() {
        return this.agility;
    }

    /**
     * @return int
     */
    public int getStamina() {
        return this.stamina + this.getEquipment().getStamina();
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
    public int getDirtyStamina() {
        return this.stamina;
    }

    /**
     * @return int
     */
    public int getEnergy() {
        return this.energy + this.getEquipment().getEnergy();
    }

    /**
     * @return int
     */
    public int getDirtyEnergy() {
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
     * @param maximum int
     * @return int
     */
    private int generateRandomPoints(int maximum) {
        return (int) (Math.random() * (maximum + 1));
    }

    /**
     * @param points int
     */
    public void earnPrimaryPoints(int points) {
        int rand = generateRandomPoints(points);
        points -= rand;
        this.strength += rand;

        rand = generateRandomPoints(points);
        points -= rand;
        this.agility += rand;

        rand = generateRandomPoints(points);
        points -= rand;
        this.stamina += rand;

        this.energy += points;
    }

    /**
     * @param experience int
     */
    public void earnExperience(int experience) {
        this.experience += experience;

        while (this.experience >= 100) {
            this.level += 1;
            this.experience -= 100;
            this.lifePoint += 3;
            this.earnPrimaryPoints(5);
        }
    }

    /**
     * @return int
     */
    public int getExperience() {
        return this.experience;
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
        } else if (item instanceof WeaponsInterface) {
            this.getBag().getItems().remove(item);
            this.getEquipment().equipWeapon((WeaponsInterface) item);
        } else if (item instanceof GlovesInterface) {
            this.getBag().getItems().remove(item);
            this.getEquipment().equipGloves((GlovesInterface) item);
        }
    }

    /**
     * @param item ItemInterface
     */
    public void unequip(ItemInterface item) {
        if (item instanceof HelmetInterface) {
            this.getBag().getItems().add(item);
            this.getEquipment().unequipHelmet((HelmetInterface) item);
        } else if (item instanceof ChestsInterface) {
            this.getBag().getItems().add(item);
            this.getEquipment().unequipChest((ChestsInterface) item);
        } else if (item instanceof BootsInterface) {
            this.getBag().getItems().add(item);
            this.getEquipment().unequipBoots((BootsInterface) item);
        } else if (item instanceof WeaponsInterface) {
            this.getBag().getItems().add(item);
            this.getEquipment().unequipWeapon((WeaponsInterface) item);
        } else if (item instanceof GlovesInterface) {
            this.getBag().getItems().add(item);
            this.getEquipment().unequipGloves((GlovesInterface) item);
        }
    }
}
