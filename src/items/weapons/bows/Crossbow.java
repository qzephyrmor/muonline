package items.weapons.bows;

import items.AbstractItem;

public class Crossbow extends AbstractItem implements BowsInterface {
    public String getName(){
        return "Cross bow";

    }

    public String getType(){
        return "bow";
    }
    public Crossbow(int points){
        super(points);
    }
}
