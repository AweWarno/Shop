package dev.fedichkin;

import dev.fedichkin.Product.ProductList;
import dev.fedichkin.Sorted.Sorted;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductList productList = new ProductList();

        Scanner scanner = new Scanner(System.in);
        boolean next = true;

        while (next) {
            System.out.printf("%4s \n", "Выберите операцию:");
            System.out.printf("%4s \n", "0. Выход из программы");
            System.out.printf("%4s \n", "1. Вывод всех доступных к покупке товаров");

            switch (scanner.nextLine()) {
                case "1":

                    productList.print(productList.getProductList());

                    boolean thisNext = true;
                    while(thisNext) {
                        System.out.printf("%4s \n", "Выберите операцию:");
                        System.out.printf("%4s \n", "0. Вернуться назад");
                        System.out.printf("%4s \n", "1. Сортировать по номеру (в порядке возрастания)");
                        System.out.printf("%4s \n", "2. Сортировать по номеру (в порядке убывания)");
                        System.out.printf("%4s \n", "3. Сортировать по цене (в порядке возрастания)");
                        System.out.printf("%4s \n", "4. Сортировать по цене (в порядке убывания)");

                        switch (scanner.nextLine()) {
                            case "1":
                                productList.print(new Sorted().sortedByID(productList.getProductList(), false));
                                break;
                            case "2":
                                productList.print(new Sorted().sortedByID(productList.getProductList(), true));
                                break;
                            case "3":
                                productList.print(new Sorted().sortedByPrice(productList.getProductList(), false));
                                break;
                            case "4":
                                productList.print(new Sorted().sortedByPrice(productList.getProductList(), true));
                                break;
                            case "0":
                            default:
                                thisNext = false;
                                break;

                        }
                    }
                    break;

                case "0":
                default:
                    next = false;
                    break;
            }
        }


    }
}