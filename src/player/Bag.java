package player;

import items.ItemInterface;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Bag {
    /**
     *
     */
    private static final int MAX_ITEMS = 20;

    private HashSet<ItemInterface> items = new HashSet<>();

    /**
     * @return Set
     */
    public Set<ItemInterface> getItems() {
        return this.items;
    }

    /**
     * @param item ItemInterface
     * @throws Exception  When the bag is full.
     */
    public void addItem(ItemInterface item) throws Exception {
        if (this.items.size() >= MAX_ITEMS) {
            throw new Exception("Bag is full");
        }

        try {
            this.items.add(item);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param item Item
     */
    public void dropItem(ItemInterface item) {
        this.items.remove(item);
    }
}
