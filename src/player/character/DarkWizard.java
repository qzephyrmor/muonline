package player.character;

import player.Character;

/**
 *
 */
public class DarkWizard extends Character {
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "Dark Wizard";
    }

    /**
     * @return int
     */
    public int getWinningPoints() {
        return this.getLevel() * (this.getEnergy() * 4 + this.getAgility() * 3 + this.getStamina() * 2 + this.getStrength());
    }

    /**
     *
     */
    public DarkWizard() {
        this.strength = 3;
        this.agility = 4;
        this.stamina = 5;
        this.energy = 8;
    }
}
