package com.pan.packs.java8programs.streamprograms.filterprograms;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 29000));
        productList.add(new Product(2, "Dell Laptop", 30000));
        productList.add(new Product(3, "Lenovo Laptop", 22000));
        productList.add(new Product(4, "Sony Laptop", 28000));
        productList.add(new Product(5, "Apple Laptop", 23000));

        productList.stream()
                .filter(Product -> Product.price>25000)
                .forEach(Product -> System.out.println(Product.price+":"+Product.name));
    }
}
