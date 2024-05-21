package ordermanagementsystem;

/**
 * The {@code OrderDb} class represents a database of orders in an order management system.
 * It allows for adding, viewing, searching, updating, and deleting orders from the database.
 */
public class OrderDb {
    private Order[] orderArray;
    private int index = 0;
    private int orderCount = 0;

    /**
     * Constructs a new order database with a specified size.
     *
     * @param size the maximum size of the database
     */
    public OrderDb(int size) {
        orderArray = new Order[size];
    }

    /**
     * Adds a new order to the database.
     *
     * @param order the order to be added
     * @return {@code true} if the order is successfully added, {@code false} otherwise
     */
    public boolean addOrder(Order order) {
        if (index < orderArray.length) {
            orderArray[index++] = order;
            System.out.println("Order details added to DB");
            orderCount++;
            return true;
        } else {
            System.out.println("Database is Full");
            return false;
        }
    }

    /**
     * Displays the full database of orders.
     */
    public void viewFullDatabase() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("CustomerName\tOrderNumber\tPrice\tProductName\tOrderDate");
        System.out.println("------------------------------------------------------------------");
        for (Order order : orderArray) {
            if (order != null) {
                System.out.println(order.getCustomerName() + "\t\t" + order.getOrderNumber() + "\t" +  order.getPrice() + "\t" + order.getProductName() + "\t" + order.getOrderDate());
            }
        }
    }

    /**
     * Returns the total count of orders in the database.
     *
     * @return the total count of orders
     */
    public int getOrderCount() {
        return orderCount;
    }

    /**
     * Searches for an order in the database based on its order number.
     *
     * @param orderNumber the order number to search for
     * @return the found {@code Order} or {@code null} if not found
     */
    public Order searchOrder(int orderNumber) {
        Order foundOrder = null;
        for (int i = 0; i < orderArray.length; i++) {
            if (orderArray[i] != null && orderArray[i].getOrderNumber() == orderNumber) {
                System.out.println("Order found in database");
                foundOrder = orderArray[i];
            }
        }
        if (foundOrder == null) {
            System.out.println("Order is not found in database");
        }
        return foundOrder;
    }

    /**
     * Updates the price of an order in the database based on its order number.
     *
     * @param orderNumber the order number of the order to be updated
     * @param amount      the amount by which the price should be updated
     * @return {@code true} if the price is successfully updated, {@code false} otherwise
     */
    public boolean updatePrice(int orderNumber, double amount) {
        Order order = searchOrder(orderNumber);
        if (order != null) {
            order.setPrice(order.getPrice() + amount);
            System.out.println("Price updated");
            return true;
        } else {
            System.out.println("Unable to update, check your order number");
            return false;
        }
    }

    /**
     * Deletes an order from the database based on its order number.
     *
     * @param orderNumber the order number of the order to be deleted
     * @return {@code true} if the order is successfully deleted, {@code false} otherwise
     */
    public boolean deleteOrder(int orderNumber) {
        boolean isDeleted = false;
        for (int i = 0; i < orderArray.length; i++) {
            if (orderArray[i] != null && orderArray[i].getOrderNumber() == orderNumber) {
                System.out.println("Order found in database and deleted");
                orderArray[i] = null;
                isDeleted = true;
                orderCount--;
            }
        }
        if (!isDeleted) {
            System.out.println("Order is not found in database");
        }
        return isDeleted;
    }
}
