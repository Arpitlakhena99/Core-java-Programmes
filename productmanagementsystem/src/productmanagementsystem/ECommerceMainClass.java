package productmanagementsystem;
/**
 * The {@code ECommerceMainClass} class contains the main method for testing the e-commerce system.
 * It creates instances of the {@code Product} class, adds them to the database, performs operations,
 * and displays the results.
 */
public class ECommerceMainClass {

    public static void main(String[] args) {

    	  /**
         * The main method for testing the e-commerce system.
         *
         * @param args the command-line arguments (not used)
         */
        OrderCreation orderCreation = new OrderCreation();
        Product product1 = orderCreation.createProduct("Laptop", 101, 899.99);
        Product product2 = orderCreation.createProduct("Smartphone", 102, 599.99);
        Product product3 = orderCreation.createProduct("Headphones", 103, 49.99);
        Product product4 = orderCreation.createProduct("Camera", 104, 699.99);
        Product product5 = orderCreation.createProduct("Printer", 105, 129.99);

        OrderDb orderDb = new OrderDb(5);

        orderDb.addProduct(product1);
        orderDb.addProduct(product2);
        orderDb.addProduct(product3);
        orderDb.addProduct(product4);
        orderDb.addProduct(product5);

        System.out.println("Total Products: " + orderDb.getOrderCount());

        orderDb.viewFullDatabase();

        System.out.println();
        Product searchedProduct = orderDb.searchProduct(103);
        if (searchedProduct != null) {
            System.out.println("Searched Product: " + searchedProduct.getProductName() + " "
                    + searchedProduct.getProductCode() + " " + searchedProduct.getPrice());
        } else {
            System.out.println("Product not found");
        }

        orderDb.updatePrice(103, 1.00);
        orderDb.viewFullDatabase();

        orderDb.deleteProduct(103);
        orderDb.viewFullDatabase();

        System.out.println("Total Products: " + orderDb.getOrderCount());
    }
}