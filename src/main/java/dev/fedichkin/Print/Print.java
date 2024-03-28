package dev.fedichkin.Print;

import dev.fedichkin.Product.Product;

import java.util.List;

public class Print extends PrintProductListToConsole {
    public void printProductList(List<Product> productList) {
        print(productList);
    }
}
