public class Main {
    public static void main(String[] args) {
        Hero andrzej = new Hero("andrzej");


        Item mushroom = ItemsFactory.getItem("mushroom");
        andrzej.startQuest(new CollectMushrooms());
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));
        andrzej.collectItem(ItemsFactory.getItem("mushroom"));

        andrzej.startQuest(new CollectMushrooms());
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
        andrzej.startQuest(new CollectMushrooms());

        andrzej.collectItem(ItemsFactory.getItem("steel"));
        andrzej.collectItem(ItemsFactory.getItem("steel"));
        andrzej.collectItem(ItemsFactory.getItem("steel"));
        andrzej.startQuest(new CollectSteel());
    }
}
