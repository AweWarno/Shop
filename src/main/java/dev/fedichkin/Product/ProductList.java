package dev.fedichkin.Product;

import dev.fedichkin.Print.Print;

import java.util.LinkedList;
import java.util.List;

public class ProductList {
    private final List<Product> productList;

    public ProductList() {
        productList = new LinkedList<>();
        Product bred = new Product(1, "Хлеб", 100, 20.0);
        Product milk = new Product(2, "Молоко", 100, 15.0);
        Product cheese = new Product(3, "Сыр", 100, 17.0);

        productList.add(bred);
        productList.add(milk);
        productList.add(cheese);
    }

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void print(List<Product> list) {
        new Print().printProductList(list);
    }
}
