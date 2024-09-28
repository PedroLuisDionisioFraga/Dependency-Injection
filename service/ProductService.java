package service;

import model.ProductModel;
import repository.ProductRepository;

public class ProductService {

  protected ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public ProductModel findByID(Long id) {
    return productRepository.findByID(id);
  }

  public void add(ProductModel product) {
    productRepository.add(product);
  }

  public void listAllProducts() {
    for (ProductModel product : productRepository.findAll()) {
      System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
    }
  }
}