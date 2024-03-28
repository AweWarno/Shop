package dev.fedichkin.Sorted;

import dev.fedichkin.Product.Product;

import java.util.Comparator;
import java.util.List;

public class Sorted {

    public List<Product> sortedByID(List<Product> list, boolean reverse) {
        return reverse
                ? new SortedByIDReverse().sorted(list)
                : new SortedByIDNatural().sorted(list);
    }

    public List<Product> sortedByPrice(List<Product> list, boolean reverse) {
        return reverse
                ? new SortedByPriceReverse().sorted(list)
                : new SortedByPriceNatural().sorted(list);
    }
}
