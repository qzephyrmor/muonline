package items.chests;

import items.AbstractItem;

public class DragonChest extends AbstractItem implements ChestsInterface {
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "Dragon Chest";
    }

    /**
     * {@inheritDoc}
     */
    public String getType(){
        return "Chest";
    }

    /**
     * @param points int
     */
    public DragonChest(int points){
        super(points);
    }
}
