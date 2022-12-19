public class Product {
    private int id;
    private String name;
    public int count;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Product(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }
}
