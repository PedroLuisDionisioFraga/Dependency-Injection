import model.ProductModel;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;
import service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
        ProductService productService = new ProductService(productRepository);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. List all products");
            System.out.println("2. Find product by ID");
            System.out.println("3. Add new product");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    productService.listAllProducts();
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    Long id = scanner.nextLong();
                    ProductModel product = productService.findByID(id);
                    if (product != null) {
                        System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: "
                                + product.getPrice());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter product ID: ");
                    Long newId = scanner.nextLong();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    Double price = scanner.nextDouble();
                    productService.add(new ProductModel(newId, name, price));
                    System.out.println("Product added.");
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println("====================================");
        }
    }
}