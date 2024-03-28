package dev.fedichkin.Product;

public class Product {
    private final int id;
    private final String name;
    private int count;
    private final double price;

    public Product(int id, String name, int count, double price) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
