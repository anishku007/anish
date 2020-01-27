package demo.demoTest.stock;
public class Order {
    private final Type type;
    private final int id;
    private final int price;

    public Order(Type type, int id, int price) {
        this.type = type;
        this.id = id;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
