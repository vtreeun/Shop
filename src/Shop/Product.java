package Shop;

public abstract class Product {
    protected int ID;
    protected int stock;
    protected float price;
    protected String brand;
    protected String description;

    public Product(int ID, float price, String brand) {
        this.ID = ID;
        this.price = price;
        this.brand = brand;
    }
}
