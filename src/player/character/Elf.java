package player.character;

import player.Character;

/**
 *
 */
public class Elf extends Character {


    /**
     * @return String
     */
    public String getName() {
        return "Elf";
    }

    /**
     * @return int
     */
    public int getWinningPoints() {
        return this.getLevel() * (this.getAgility() * 4 + this.getStamina() * 3 + this.getStrength() * 2 + this.getEnergy());
    }

    /**
     *
     */
    public Elf() {
        this.strength = 5;
        this.agility = 7;
        this.stamina = 5;
        this.energy = 3;
    }
}
