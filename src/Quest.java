public interface Quest {
    void addQuestMaker(QuestMaker hero);

    void update(Integer i, QuestMaker hero);

    Item itemToCollect();

    Item reward(QuestMaker hero);

    String getQuestName();
}
