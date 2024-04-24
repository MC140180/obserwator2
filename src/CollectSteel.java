import java.util.ArrayList;
import java.util.Objects;

public class CollectSteel extends CollectQuest {

    public CollectSteel() {
        super();
        itemsToReward = 3;
        questName = "collectSteel";
        itemToCollect = ItemsFactory.getItem("steel");
        questReward = ItemsFactory.getItem("War Hammer");
    }
}
