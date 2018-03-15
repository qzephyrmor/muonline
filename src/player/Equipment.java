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

    public ChestsInterface getChest() {
        return this.chest;
    }

    public void equipChest(ChestsInterface chest) {
        this.chest = chest;
    }

    public BootsInterface getBoots() {
        return this.boots;
    }

    public void equipBoots(BootsInterface boots) {
        this.boots = boots;
    }

    public GlovesInterface getGloves() {
        return this.gloves;
    }

    public void equipGloves(GlovesInterface gloves) {
        this.gloves = gloves;
    }

    public WeaponsInterface getWeapon() {
        return this.weapon;
    }

    public void equipWeapon(WeaponsInterface weapon) {
        this.weapon = weapon;
    }
}
