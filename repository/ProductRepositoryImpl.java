package repository;

import model.ProductModel;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private List<ProductModel> products = new ArrayList<>();

    public ProductRepositoryImpl() {
        // Initialize with some dummy data
        products.add(new ProductModel(1L, "Product 1", 100.0));
        products.add(new ProductModel(2L, "Product 2", 200.0));
    }

    @Override
    public ProductModel findByID(Long id) {
        ProductModel result = null;
        for (ProductModel product : products) {
            if (product.getId().equals(id)) {
                result = product;
                break;
            }
        }
        return result;
    }

    @Override
    public List<ProductModel> findAll() {
        return products;
    }

    @Override
    public void add(ProductModel product) {
        products.add(product);
    }
}