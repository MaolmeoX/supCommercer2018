package fr.imie.supcommerce.dao;

import fr.imie.supcommerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    static List<Product> products = new ArrayList<>();

    public static List<Product> getAllProducts() {
        return products;
    }

    public static void addProduct(Product p) {
        Long newId = Long.valueOf(products.size() + 1);
        p.setId(newId);
        products.add(p);
    }

    public static Product findProduct(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public static void removeProduct(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
            }
        }
    }
}
