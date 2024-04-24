public class Main {
    public static void main(String[] args) {
     Hero andrzej = new Hero("andrzej");

        andrzej.startQuest(new CollectMushrooms());

        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));

        andrzej.startQuest(new CollectMushrooms()); //po ukończeniu poprzedniego questa, mogę zacząc nowy, ten sam
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms")); //otrzymuje kolejna nagrode po zebraniu nastepnych 5

        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.collectItem(new Item("mushrooms"));
        andrzej.startQuest(new CollectMushrooms()); //otrzymuję odrazu nagrodę gdyż w ekwipunku znajduję sie 5 grzybow

    }
}
