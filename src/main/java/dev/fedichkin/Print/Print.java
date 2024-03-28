package dev.fedichkin.Print;

import dev.fedichkin.Product.Product;

import java.util.List;

public class Print {
    public void printProductList(List<Product> productList) {
        new PrintProductList().print(productList);
    }
}
