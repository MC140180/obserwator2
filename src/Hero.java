import java.util.ArrayList;
import java.util.Objects;

public class Hero implements QuestMaker {
    private Equipment equipment;
    private ArrayList<Quest> quests;
    private String name;

    public Hero(String name) {
        this.name = name;
        this.equipment = new Equipment();
        this.quests = new ArrayList<>();
    }

    void collectItem(Item i) {
        this.equipment.addItemsToBag(i, 1);
        this.notifyQuest(i);
    }

    void startQuest(Quest quest) {
        this.registerQuest(quest);
        this.notifyQuest(quest.itemToCollect());
    }
    public Equipment getEquipment() {
        return equipment;
    }
    @Override
    public void registerQuest(Quest quest) {
        for (Quest quest1 : quests) {
            if (Objects.equals(quest1.getQuestName(), quest.getQuestName())) {
                System.out.println("this quest is already started");
                return;
            }
        }
        quest.addQuestMaker(this);
        this.quests.add(quest);
    }

    @Override
    public void deleteQuest(Quest o) {
        System.out.println(this.quests);
        this.quests.remove(o);
    }

    @Override
    public void notifyQuest(Item i) {
        ArrayList<Quest> questsCopy = new ArrayList<>(this.quests);
        for (Quest quest : questsCopy) {
            if (Objects.equals(quest.itemToCollect(), i)) {
                quest.update(this.equipment.getItemsInBag().get(i), this);
            }
        }
    }

    @Override
    public void getReward(Quest o) {
        o.reward(this);
    }
}

