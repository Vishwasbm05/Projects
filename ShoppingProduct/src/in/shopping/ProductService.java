package in.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductService {
    List<Product> products = new ArrayList<>();


    void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }

    void deleteProduct(int id) {
        products.removeIf(product -> product.id == id);
        System.out.println("Product deleted successfully.");
    }

    void updateProduct(int id, String name, String category, double price) {
        for (Product product : products) {
            if (product.id == id) {
                product.name = name;
                product.category = category;
                product.price = price;
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    List<Product> viewProducts(String category) {
        return products.stream()
                .filter(product -> product.category.equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
}

class CartService {
    List<CartItem> cartItems = new ArrayList<>();

    void addToCart(Product product, int quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.product.id == product.id) {
                cartItem.quantity += quantity;
                System.out.println("Product quantity updated in cart.");
                return;
            }
        }
        cartItems.add(new CartItem(product, quantity));
        System.out.println("Product added to cart.");
    }

    double checkout() {
        double total = cartItems.stream().mapToDouble(CartItem::getTotalPrice).sum();
        cartItems.clear();
        return total;
    }

    void viewCart() {
        cartItems.forEach(System.out::println);
    }
}


