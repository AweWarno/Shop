package dev.fedichkin.Sorted;

import dev.fedichkin.Product.Product;

import java.util.Comparator;
import java.util.List;

public class SortedByIDReverse implements ISorterBY {
    @Override
    public List<Product> sorted(List<Product> list) {
        Comparator<Product> comparator = Comparator.comparing(Product::getId);

        return list
                .stream()
                .sorted(comparator.reversed())
                .toList();
    }

}
