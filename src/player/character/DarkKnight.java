package player.character;

import player.Character;

/**
 *
 */
public class DarkKnight extends Character {
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "Dark Knight";
    }

    /**
     * @return int
     */
    public int getWinningPoints() {
        return this.getLevel() * (this.getStrength() * 4 + this.getAgility() * 3 + this.getStamina() * 2 + this.getEnergy());
    }

    /**
     *
     */
    public DarkKnight() {
        this.strength = 8;
        this.agility = 2;
        this.stamina = 7;
        this.energy = 3;
    }
}
