import java.util.HashMap;

public class Equipment {
    private HashMap<Item, Integer> itemsInBag;

    public Equipment() {
        this.itemsInBag = new HashMap<>();
    }

    public HashMap<Item, Integer> getItemsInBag() {
        return itemsInBag;
    }

    public void addItemsToBag(Item item, Integer quantity) {
        this.itemsInBag.compute(item, (key, oldValue) -> {
            if (oldValue == null) {
                return quantity;
            } else {
                return oldValue + quantity;
            }
        });
    }

    public void removeItemsFromBag(Item item, Integer quantity) {
        this.itemsInBag.computeIfPresent(item, (key, oldValue) -> {
                    return Math.max(oldValue - quantity, 0);
                }
        );
    }
}
