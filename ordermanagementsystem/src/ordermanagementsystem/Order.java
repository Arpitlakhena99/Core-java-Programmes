package ordermanagementsystem;
/**
 * The {@code Order} class represents an order in an order management system.
 * It includes information such as the customer name, order number, price, product name, and order date.
 */
public class Order {
    private String customerName;
    private int orderNumber;
    private double price;
    private String productName;
    private String orderDate;

    /**
     * Constructs a new order with the specified details.
     *
     * @param customerName the name of the customer placing the order
     * @param orderNumber  the unique order number assigned to the order
     * @param price        the total amount of the order
     * @param productName  the name of the product in the order
     * @param orderDate    the date when the order was placed
     */
    public Order(String customerName, int orderNumber, double price, String productName, String orderDate) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.price = price;
        this.productName = productName;
        this.orderDate = orderDate;
    }

    // Getter and setter methods for customerName, orderNumber, price, productName, and orderDate...

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}