public interface QuestObserver {
    void addQuestMaker(QuestMaker hero);

    void update(Integer i, QuestMaker hero);

    String itemToCollect();

    Item reward();

    String getQuestName();
}
