package items.boots;

import items.AbstractItem;

/**
 *
 */
public class NoviceBoots extends AbstractItem implements BootsInterface {
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "Novice Boots";
    }

    /**
     * {@inheritDoc}
     */
    public String getType() {
        return "Boots";
    }

    /**
     * @param points int
     */
    public NoviceBoots(int points) {
        super(points);
    }
}
