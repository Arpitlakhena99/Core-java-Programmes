package ordermanagementsystem;

/**
 * The {@code OrderMainClass} contains the main method for testing the order management system.
 * It creates instances of the {@code Order} class, adds them to the database, performs operations,
 * and displays the results.
 */
public class OrderMainClass {
    /**
     * The main method for testing the order management system.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating instances of OrderCreation and Order classes
        OrderCreation oc = new OrderCreation();
        Order o1 = oc.createOrder("Arpith", 101, 500.00, "Mobile phone", "2022-02-15");
        Order o2 = oc.createOrder("Nabeel", 102, 800.00, "Earphones", "2022-02-16");
        Order o3 = oc.createOrder("Biswajit", 103, 1200.00, "Product C", "2022-02-17");
        Order o4 = oc.createOrder("Mayank", 104, 300.00, "Product A", "2022-02-18");
        Order o5 = oc.createOrder("Manan", 105, 1500.00, "Product B", "2022-02-19");

        // Creating an instance of OrderDb class
        OrderDb oDB = new OrderDb(5);

        // Adding orders to the database
        oDB.addOrder(o1);
        oDB.addOrder(o2);
        oDB.addOrder(o3);
        oDB.addOrder(o4);
        oDB.addOrder(o5);

        // Displaying total orders and the full database
        System.out.println("Total Orders: " + oDB.getOrderCount());
        oDB.viewFullDatabase();

        System.out.println();

        // Searching for an order and displaying the result
        Order foundOrder = oDB.searchOrder(103);
        if (foundOrder != null) {
            System.out.println("Searched Order: " + foundOrder.getCustomerName() + " " +
                               foundOrder.getOrderNumber() + " " + foundOrder.getPrice());
        } else {
            System.out.println("Order not found");
        }

        // Updating the price of an order and displaying the updated database
        oDB.updatePrice(103, 200.00);
        oDB.viewFullDatabase();

        // Deleting an order and displaying the updated database
        oDB.deleteOrder(103);
        oDB.viewFullDatabase();

        // Displaying the total number of orders
        System.out.println("Total Orders: " + oDB.getOrderCount());
    }
}
