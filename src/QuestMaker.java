public interface QuestMaker {
    void getReward(QuestObserver o);

    void registerQuest(QuestObserver o);

    void deleteQuest(QuestObserver o);

    void notifyQuest(Item i);

    String getName();

    Equipment getEquipment();
}
