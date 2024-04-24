public abstract class Item {
    String name;

    protected Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
