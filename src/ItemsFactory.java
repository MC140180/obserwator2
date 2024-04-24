import java.util.ArrayList;
import java.util.Objects;

public class ItemsFactory extends Item {
    private static ArrayList<Item> items = new ArrayList<>();

    private ItemsFactory(String name) {
        super(name);
    }

    public static Item getItem(String name){
        for(Item i: items){
            if(Objects.equals(i.getName(), name)) {
                return i;
            }
        }
        Item newItem = new ItemsFactory(name);
        items.add(newItem);
        return newItem;
    }
}
