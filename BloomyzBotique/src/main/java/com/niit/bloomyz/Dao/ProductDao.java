package com.niit.bloomyz.Dao;

import java.util.List;

import com.niit.bloomyz.model.Product;


public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
