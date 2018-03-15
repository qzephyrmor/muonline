package items.weapons.rods;


import items.AbstractItem;

public class LegendaryRods extends AbstractItem implements RodsInterface {
    /**
     *
     * @return
     */
    public String getName(){
        return "Legendary Rod";
    }

    /**
     *
     * @return
     */
    public String getType(){
        return "Rod";
    }

    /**
     * 
     * @param points
     */
    public LegendaryRods(int points){
        super(points);
    }
}
