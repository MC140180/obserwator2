import java.util.ArrayList;
import java.util.Objects;

public class CollectMushrooms extends CollectQuest {

    public CollectMushrooms() {
        super();
        itemsToReward = 5;
        questName = "collectMushrooms";
        itemToCollect = ItemsFactory.getItem("mushroom");
        questReward = ItemsFactory.getItem("Magic Sword");
    }

}
