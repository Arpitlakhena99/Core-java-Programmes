package FoodOrderingSystem;
/**
 * The {@code FoodOrder} class represents a food item in a food ordering system.
 * It includes information such as the item name, item code, and price.
 */
public class FoodOrder {
	    private String itemName;
	    private int itemCode;
	    private double price;
	    /**
	     * Constructs a new food order with the specified details.
	     *
	     * @param itemName the name of the food item
	     * @param itemCode the unique code assigned to the food item
	     * @param price  the price of the food item
	     */
	    public FoodOrder(String itemName, int itemCode, double price) {
	        this.itemName = itemName;
	        this.itemCode = itemCode;
	        this.price = price;
	    }
	    // Getter and setter methods for itemName, itemCode, and price...
	    public String getItemName() {
	        return itemName;
	    }

	    public void setItemName(String itemName) {
	        this.itemName = itemName;
	    }
	    public int getItemCode() {
	        return itemCode;
	    }

	    public void setItemCode(int itemCode) {
	        this.itemCode = itemCode;
	    }
	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
}
