package items.helmets;

import items.AbstractItem;

public class BrassHelmet extends AbstractItem implements HelmetInterface {
    /**
     *
     * @return
     */
    public String getName(){
        return "Brass Helmet";

    }

    /**
     *
     * @return
     */
    public String getType(){
        return "Helmet";

    }

    /**
     *
     * @param points
     */
    public BrassHelmet(int points){
        super(points);
    }
}
