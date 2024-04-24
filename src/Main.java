public class Main {
    public static void main(String[] args) {
     Hero andrzej = new Hero("andrzej");

        andrzej.startQuest(new CollectMushrooms());
        andrzej.startQuest(new CollectMushrooms());

        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
    }
}
