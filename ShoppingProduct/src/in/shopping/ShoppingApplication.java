package in.shopping;

import java.util.Scanner;

public class ShoppingApplication {
    static Scanner scanner = new Scanner(System.in);
    static ProductService productService = new ProductService();
    static CartService cartService = new CartService();
    static LoginController loginController = new LoginController();

    public static void main(String[] args) {
        productService.addProduct(new Product(1, "TV", "Electronics", 30000.0));
        productService.addProduct(new Product(2, "Laptop", "Electronics", 50000.0));
        productService.addProduct(new Product(3, "Mobiles", "Electronics", 20000.0));
        productService.addProduct(new Product(4, "Shirt", "Clothing", 200.0));
        productService.addProduct(new Product(5, "Pants", "Clothing", 800.0));
        productService.addProduct(new Product(6, "FootWear", "Clothing", 500.0));
        productService.addProduct(new Product(7, "Washing Machine", "Home", 15500.0));
        productService.addProduct(new Product(8, "Fridge", "Home", 17000.0));
        productService.addProduct(new Product(9, "Table", "Home", 7000.0));

        while (true) {
            System.out.println("Welcome to the Shopping Application");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                login();
            } else if (choice == 2) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void login() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        User user = loginController.login(username, password);
        if (user != null) {
            if (user.role.equals("admin")) {
                adminMenu();
            } else {
                userMenu();
            }
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }

    static void adminMenu() {
        while (true) {
            System.out.println("Admin Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Update Product");
            System.out.println("4. Logout");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 1) {
                System.out.println("Enter product id:");
                int id = scanner.nextInt();
                scanner.nextLine();  
                System.out.println("Enter product name:");
                String name = scanner.nextLine();
                System.out.println("Enter product category:");
                String category = scanner.nextLine();
                System.out.println("Enter product price:");
                double price = scanner.nextDouble();
                scanner.nextLine();  
                productService.addProduct(new Product(id, name, category, price));
            } else if (choice == 2) {
                System.out.println("Enter product id to delete:");
                int id = scanner.nextInt();
                scanner.nextLine();  
                productService.deleteProduct(id);
            } else if (choice == 3) {
                System.out.println("Enter product id to update:");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.println("Enter new product name:");
                String name = scanner.nextLine();
                System.out.println("Enter new product category:");
                String category = scanner.nextLine();
                System.out.println("Enter new product price:");
                double price = scanner.nextDouble();
                scanner.nextLine();  
                productService.updateProduct(id, name, category, price);
            } else if (choice == 4) {
                System.out.println("Logging out...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void userMenu() {
        while (true) {
            System.out.println("User Menu");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Logout");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 1) {
                System.out.println("Enter category (Electronics, Clothing, Home):");
                String category = scanner.nextLine();
                productService.viewProducts(category).forEach(System.out::println);
            } else if (choice == 2) {
                System.out.println("Enter product id:");
                int id = scanner.nextInt();
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                scanner.nextLine();  
                Product product = productService.products.stream()
                        .filter(p -> p.id == id)
                        .findFirst()
                        .orElse(null);
                if (product != null) {
                    cartService.addToCart(product, quantity);
                } else {
                    System.out.println("Product not found.");
                }
            } else if (choice == 3) {
                cartService.viewCart();
            } else if (choice == 4) {
                double total = cartService.checkout();
                System.out.println("Total amount: " + total);
                System.out.println("Purchased successfully.");
            } else if (choice == 5) {
                System.out.println("Logging out...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
