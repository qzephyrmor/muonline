package items.gloves;

import items.AbstractItem;

public class BronzeGloves extends AbstractItem implements GlovesInterface  {
    /**
     *
     * @return
     */
        public String getName(){
            return "Bronze Glove";
        }

    /**
     *
     * @return
     */
    public String getType(){
                return "Glove";
        }

    /**
     *
     * @param points
     */
    public BronzeGloves(int points){
            super(points);
        }

}
