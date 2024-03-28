package dev.fedichkin.Sorted;

import dev.fedichkin.Product.Product;

import java.util.List;

@FunctionalInterface
public interface ISorterBY {
    public List<Product> sorted(List<Product> list);
}
