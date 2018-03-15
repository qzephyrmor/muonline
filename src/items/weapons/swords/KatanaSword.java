package items.weapons.swords;

import items.AbstractItem;

public class KatanaSword extends AbstractItem implements SwordsInterface {
    /**
     *
     * @return
     */
        public String getName(){
            return "Katana Sword";

        }

    /**
     *
     * @return
     */
    public String getType(){
            return "Sword";
        }

    /**
     *
     * @param points
     */

    public KatanaSword(int points){
            super(points);
        }
}
