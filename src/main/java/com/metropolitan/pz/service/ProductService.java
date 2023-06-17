package com.metropolitan.pz.service;

import com.metropolitan.pz.entities.Product;
import com.metropolitan.pz.repository.ProductRepository;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProductById(Long id);

    public Product createProduct(Product product);

    public Product updateProduct(Long id, Product updatedProduct);

    public void deleteProduct(Long id);
}
