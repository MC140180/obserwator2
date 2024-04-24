import java.util.ArrayList;
import java.util.Objects;

public abstract class CollectQuest implements Quest {
    protected Item itemToCollect;
    protected String questName;
    protected Item questReward;
    protected Integer itemsToReward;
    protected ArrayList<QuestMaker> questMakers;

    public CollectQuest() {
        questMakers = new ArrayList<>();
    }

    void giveRewardForHero(QuestMaker hero) {
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
            if (existingHero.equals(hero)) {
                System.out.println("This hero is already in the list.");
                return;
            }
        }
        this.questMakers.add(hero);
    }

    @Override
    public Item itemToCollect() {
        return itemToCollect;
    }

    @Override
    public Item reward(QuestMaker hero) {
        hero.getEquipment().removeItemsFromBag(this.itemToCollect, this.itemsToReward);
        hero.getEquipment().addItemsToBag(this.questReward, 1);
        System.out.println("otrzymano nagrode za zebranie " + this.itemsToReward + " " + this.itemToCollect);
        return this.questReward;
    }

    @Override
    public String getQuestName() {
        return this.questName;
    }
}
