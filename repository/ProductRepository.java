package repository;

import model.ProductModel;
import java.util.List;

public interface ProductRepository {
    ProductModel findByID(Long id);
    List<ProductModel> findAll();
    void add(ProductModel product);
}
