public interface QuestMaker {
    void registerQuest(Quest o);

    void deleteQuest(Quest o);

    void notifyQuest(Item i);

    Equipment getEquipment();
}
