import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Hero implements QuestMaker{
    private HashMap<String, Integer> itemsInBag;
    private ArrayList<QuestObserver> quests;
    private String name;

    public Hero(String name) {
        this.name = name;
        this.itemsInBag = new HashMap<>();
        this.quests = new ArrayList<>();
    }

    void collectItem(Item i){
      if(this.itemsInBag.containsKey(i.getName())){
          this.itemsInBag.put(i.getName(), this.itemsInBag.get(i.getName()) + 1);
          this.notifyQuest(i.getName());
          return;
      };
      this.itemsInBag.put(i.getName(), 1);
      this.notifyQuest(i.getName());
    }

    void startQuest(QuestObserver quest){
        this.registerQuest(quest);
        quest.addQuestMaker(this);
        this.notifyQuest(quest.itemToCollect());
    }

    @Override
    public void registerQuest(QuestObserver quest) {
        for(QuestObserver quest1: quests){
            if(Objects.equals(quest1.getQuestName(), quest.getQuestName())){
                System.out.println("this quest is already started");
                return;
            }
        }

        this.quests.add(quest);
    }

    @Override
    public void deleteQuest(QuestObserver o) {
        System.out.println(this.quests);
        this.quests.remove(o);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void notifyQuest(String i) {
        ArrayList<QuestObserver> questsCopy = new ArrayList<>(this.quests);
        for(QuestObserver quest: questsCopy){
            if(Objects.equals(quest.itemToCollect(), i)){
                quest.update(this.itemsInBag.get(i), this);
            }
        }
    }

    @Override
    public void getReward(QuestObserver o) {
        o.reward();
    }
}

