import java.util.ArrayList;
import java.util.Objects;

public class CollectMushrooms implements QuestObserver {
    private String itemToCollect = "mushrooms";
    private String questName = "collectMushroom";
    private Integer itemsToReward = 5;
    private ArrayList<QuestMaker> questMakers = new ArrayList<>();

    void giveRewardForHero(QuestMaker hero) {
        hero.getEquipment().removeItemsFromBag(new Item(this.itemToCollect), this.itemsToReward);
        hero.getReward(this);
    }

    @Override
    public void update(Integer i, QuestMaker hero) {
        if (!this.questMakers.contains(hero)) {
            System.out.println("This hero haven't start this quest");
            return;
        }
        if (Objects.equals(i, itemsToReward)) {
            giveRewardForHero(hero);
            this.questMakers.remove(hero);
            hero.deleteQuest(this);
        }
    }

    @Override
    public void addQuestMaker(QuestMaker hero) {
        for (QuestMaker existingHero : this.questMakers) {
            if (existingHero.getName().equals(hero.getName())) {
                System.out.println("This hero is already in the list.");
                return;
            }
        }
        this.questMakers.add(hero);
    }

    @Override
    public String itemToCollect() {
        return itemToCollect;
    }

    @Override
    public Item reward() {
        System.out.println("otrzymano nagrode za zebranie 5 grzybow");
        return new Item("Magic sword");
    }

    @Override
    public String getQuestName() {
        return this.questName;
    }
}
