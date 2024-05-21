package productmanagementsystem;
/**
 * The {@code OrderCreation} class is responsible for creating instances of the {@code Product} class.
 * It provides a method to create a new product with specified details.
 */
	public class OrderCreation {
	    private static int randnum = 101;
	    /**
	     * Creates and returns a new {@code Product} with the given details.
	     *
	     * @param productName the name of the product
	     * @param productCode the unique code assigned to the product
	     * @param price the price of the product
	     * @return a new {@code Product} instance
	     */

	    public Product createProduct(String productName, int productCode, double price) {
	        Product product = new Product(productName, productCode, price);
	        return product;
	    }
	}