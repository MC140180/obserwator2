public class Main {
    public static void main(String[] args) {
        Hero andrzej = new Hero("andrzej");


        Item mushroom = ItemsFactory.getItem("mushroom");
        andrzej.startQuest(new CollectMushrooms(mushroom));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));

        andrzej.startQuest(new CollectMushrooms(mushroom));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));

        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.startQuest(new CollectMushrooms(mushroom));

    }
}
