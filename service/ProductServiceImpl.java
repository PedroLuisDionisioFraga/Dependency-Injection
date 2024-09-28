package service;

import model.ProductModel;
import repository.ProductRepository;
import java.util.List;

public class ProductServiceImpl extends ProductService {

  public ProductServiceImpl(ProductRepository productRepository) {
    super(productRepository);
  }

  public ProductModel findByID(Long id) {
    return super.productRepository.findByID(id);
  }

  public List<ProductModel> findAll() {
    return super.productRepository.findAll();
  }

  public void add(ProductModel product) {
    super.productRepository.add(product);
  }
}