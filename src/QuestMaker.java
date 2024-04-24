public interface QuestMaker {
    void getReward(Quest o);

    void registerQuest(Quest o);

    void deleteQuest(Quest o);

    void notifyQuest(Item i);

    Equipment getEquipment();
}
