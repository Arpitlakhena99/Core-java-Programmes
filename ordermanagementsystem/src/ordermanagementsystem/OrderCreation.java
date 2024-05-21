package ordermanagementsystem;
/**
 * The {@code OrderCreation} class is responsible for creating instances of the {@code Order} class.
 * It provides a method to create a new order with specified details.
 */
public class OrderCreation {
    /**
     * Creates and returns a new {@code Order} with the given details.
     *
     * @param customerName the name of the customer placing the order
     * @param orderNumber  the unique order number assigned to the order
     * @param price        the total amount of the order
     * @param productName  the name of the product in the order
     * @param orderDate    the date when the order was placed
     * @return a new {@code Order} instance
     */
    public Order createOrder(String customerName, int orderNumber, double price, String productName, String orderDate) {
        return new Order(customerName, orderNumber, price, productName, orderDate);
    }
}
	