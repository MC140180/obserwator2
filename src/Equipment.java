import java.util.HashMap;

public class Equipment {
    private HashMap<String, Integer> itemsInBag;

    public Equipment() {
        this.itemsInBag = new HashMap<>();
    }

    public HashMap<String, Integer> getItemsInBag() {
        return itemsInBag;
    }

    public void addItemsToBag(Item item, Integer quantity) {
        this.itemsInBag.compute(item.getName(), (key, oldValue) -> {
            if (oldValue == null) {
                return quantity;
            } else {
                return oldValue + quantity;
            }
        });
    }

    public void removeItemsFromBag(Item item, Integer quantity) {
        this.itemsInBag.computeIfPresent(item.getName(), (key, oldValue) -> {
                    return Math.max(oldValue - quantity, 0);
                }
        );
    }
}
