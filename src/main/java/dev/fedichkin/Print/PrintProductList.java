package dev.fedichkin.Print;

import dev.fedichkin.Product.Product;

import java.util.List;

public class PrintProductList {
    public void print(List<Product> list) {
        if(!list.isEmpty()) {
            System.out.printf("%3s %-5s %3s %-20s %3s %-10s %3s %-10s %3s %n",
                    " | ",
                    "Номер",
                    " | ",
                    "Наименование",
                    " | ",
                    "Цена",
                    " | ",
                    "Количество",
                    " | ");
            System.out.printf("%3s %-5s %3s %-20s %3s %-10s %3s %-10s %3s %n",
                    " | ",
                    "-".repeat(5),
                    " | ",
                    "-".repeat(20),
                    " | ",
                    "-".repeat(10),
                    " | ",
                    "-".repeat(10),
                    " | ");
            for(Product product : list) {

                System.out.printf("%3s %-5s %3s %-20s %3s %-10s %3s %-10s %3s %n",
                        " | ",
                        product.getId(),
                        " | ",
                        product.getName(),
                        " | ",
                        product.getPrice(),
                        " | ",
                        product.getCount(),
                        " | ");
            }
            System.out.printf("%3s %-5s %3s %-20s %3s %-10s %3s %-10s %3s %n",
                    " | ",
                    "-".repeat(5),
                    " | ",
                    "-".repeat(20),
                    " | ",
                    "-".repeat(10),
                    " | ",
                    "-".repeat(10),
                    " | ");
        } else {
            System.out.println("Список продуктов доступных к покупке пуст.");
        }
    }
}
