public interface QuestObserver {
    void addQuestMaker(QuestMaker hero);

    void update(Integer i, QuestMaker hero);

    Item itemToCollect();

    Item reward();

    String getQuestName();
}
