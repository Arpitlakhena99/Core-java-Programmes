package productmanagementsystem;
/**
 * The {@code Product} class represents a product in an e-commerce system.
 * It includes information such as the product name, product code, and price.
 */
public class Product {
    private String productName;
    private int productCode;
    private double price;
    /**
     * Constructs a new product with the specified details.
     *
     * @param productName the name of the product
     * @param productCode the unique code assigned to the product
     * @param price the price of the product
     */
    public Product(String productName, int productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }
    // Getter and setter methods...
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

