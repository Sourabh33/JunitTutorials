package org.example.dao;

import org.example.ProductDetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDao {

    private static final Map<String, ProductDetail> productMapByName = new HashMap<>();
    private static final Map<Integer, ProductDetail> productMapById = new HashMap<>();

    public ProductDetail get(String name) {
        return productMapByName.get(name);
    }

    public List<ProductDetail> getAll() {
        return new ArrayList<>(productMapByName.values());
    }

    public List<ProductDetail> getItems(int numberOfItems) {
        return new ArrayList<>(productMapByName.values())
                .subList(0, numberOfItems);
    }

    public ProductDetail getByMap(Map<String, Integer> nameToPrice) {
        String name = nameToPrice.keySet().stream().findFirst().orElse(null);
        return productMapByName.get(name);
    }

    public void add(ProductDetail product) {
        productMapByName.put(product.getName(), product);
    }

    public ProductDetail getById(Integer productId) {
        return productMapById.get(productId);
    }
}
