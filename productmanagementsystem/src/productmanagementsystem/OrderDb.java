package productmanagementsystem;
/**
 * The {@code OrderDb} class represents a database of products in an e-commerce system.
 * It allows for adding, viewing, searching, updating, and deleting products from the database.
 */
public class OrderDb {
    private Product[] products;
    private int index = 0;
    private int orderCount = 0;

    /**
     * Constructs a new product database with a specified size.
     *
     * @param size the maximum size of the database
     */
    public OrderDb(int size) {
        products = new Product[size];
    }
    
    /**
     * Adds a new product to the database.
     *
     * @param product the product to be added
     * @return {@code true} if the product is successfully added, {@code false} otherwise
     */

    public boolean addProduct(Product product) {
    	 // Implementation...
    	if (index < products.length) {
            products[index++] = product;
            System.out.println("Product details added to DB");
            orderCount++;
            return true;
        } else {
            System.out.println("Database is Full");
            return false;
        }
    }

    public void viewFullDatabase() {
        System.out.println("----------------------------------------------------");
        System.out.println("ProductCode\tProductName\tPrice");
        System.out.println("----------------------------------------------------");
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getProductCode() + "\t\t" + product.getProductName() + "\t\t" + product.getPrice());
            }
        }
    }
    /**
     * Returns the total count of products in the database.
     *
     * @return the total count of products
     */

    public int getOrderCount() {
        return orderCount;
    }
    /**
     * Searches for a product in the database based on its product code.
     *
     * @param productCode the product code to search for
     * @return the found {@code Product} or {@code null} if not found
     */

    public Product searchProduct(int productCode) {
        Product product = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getProductCode() == productCode) {
                System.out.println("Product found in database");
                product = products[i];
            }
        }
        if (product == null) {
            System.out.println("Product is not found in database");
        }
        return product;
    }
    /**
     * Updates the price of a product in the database based on its product code.
     *
     * @param productCode the product code of the product to be updated
     * @param amount      the amount by which the price should be updated
     * @return {@code true} if the price is successfully updated, {@code false} otherwise
     */
    public boolean updatePrice(int productCode, double amount) {
        Product product = searchProduct(productCode);
        if (product != null) {
            product.setPrice(product.getPrice() + amount);
            System.out.println("Price updated");
            return true;
        } else {
            System.out.println("Unable to update, check your product code");
            return false;
        }
    }
    /**
     * Deletes a product from the database based on its product code.
     *
     * @param productCode the product code of the product to be deleted
     * @return {@code true} if the product is successfully deleted, {@code false} otherwise
     */
    public boolean deleteProduct(int productCode) {
        boolean isDeleted = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getProductCode() == productCode) {
                System.out.println("Product found in database and deleted");
                products[i] = null;
                isDeleted = true;
                orderCount--;
            }
        }
        if (!isDeleted) {
            System.out.println("Product is not found in database");
        }
        return isDeleted;
    }
}
