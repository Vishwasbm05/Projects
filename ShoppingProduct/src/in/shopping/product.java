package in.shopping;


class Product {
    int id;
    String name;
    String category;
    double price;

    Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
    }

}

class User {
    String username;
    String password;
    String role;

    User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}

class CartItem {
    Product product;
    int quantity;

    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return product.price * quantity;
    }

    @Override
    public String toString() {
        return "CartItem [product=" + product + ", quantity=" + quantity + ", total=" + getTotalPrice() + "]";
    }
}