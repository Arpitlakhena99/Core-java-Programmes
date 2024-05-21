package FoodOrderingSystem;
/**
 * The {@code OrderCreation} class is responsible for creating instances of the {@code FoodOrder} class.
 * It provides a method to create a new food order with specified details.
 */
public class OrderCreation {
	    private static int randnum = 101;
	    /**
	     * Creates and returns a new {@code FoodOrder} with the given details.
	     *
	     * @param itemName the name of the food item
	     * @param price    the price of the food item
	     * @return a new {@code FoodOrder} instance
	     */
	    public FoodOrder createFoodOrder(String itemName, int itemCode, double price) {
	        FoodOrder foodOrder = new FoodOrder(itemName, itemCode, price);
	        return foodOrder;
	    }
	}