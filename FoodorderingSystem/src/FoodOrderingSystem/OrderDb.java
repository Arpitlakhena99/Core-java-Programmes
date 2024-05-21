package FoodOrderingSystem;
/**
 * The {@code OrderDb} class represents a database of food orders in a food ordering system.
 * It allows for adding, viewing, searching, updating, and deleting food orders from the database.
 */
public class OrderDb {
	    private FoodOrder[] foodOrders;
	    private int index = 0;
	    private int orderCount = 0;
	    /**
	     * Constructs a new food order database with a specified size.
	     *
	     * @param size the maximum size of the database
	     */
	    public OrderDb(int size) {
	        foodOrders = new FoodOrder[size];
	    }
	    /**
	     * Adds a new food order to the database.
	     *
	     * @param foodOrder the food order to be added
	     * @return {@code true} if the food order is successfully added, {@code false} otherwise
	     */
	    public boolean addFoodOrder(FoodOrder foodOrder) {
	        if (index < foodOrders.length) {
	            foodOrders[index++] = foodOrder;
	            System.out.println("Food order details added to DB");
	            orderCount++;
	            return true;
	        } else {
	            System.out.println("Database is Full");
	            return false;
	        }
	    }
	    /**
	     * Displays the full database of food orders.
	     */
	    public void viewFullDatabase() {
	        System.out.println("----------------------------------------------------");
	        System.out.println("ItemCode\tItemName\tPrice");
	        System.out.println("----------------------------------------------------");
	        for (FoodOrder order : foodOrders) {
	            if (order != null) {
	                System.out.println(order.getItemCode() + "\t\t" + order.getItemName() + "\t\t" + order.getPrice());
	            }
	        }
	    }
	    /**
	     * Returns the total count of food orders in the database.
	     *
	     * @return the total count of food orders
	     */
	    public int getOrderCount() {
	        return orderCount;
	    }

	    /**
	     * Searches for a food order in the database based on its item code.
	     *
	     * @param itemCode the item code to search for
	     * @return the found {@code FoodOrder} or {@code null} if not found
	     */
	    public FoodOrder searchFoodOrder(int itemCode) {
	        FoodOrder foodOrder = null;
	        for (int i = 0; i < foodOrders.length; i++) {
	            if (foodOrders[i] != null && foodOrders[i].getItemCode() == itemCode) {
	                System.out.println("Food order found in database");
	                foodOrder = foodOrders[i];
	            }
	        }
	        if (foodOrder == null) {
	            System.out.println("Food order is not found in database");
	        }
	        return foodOrder;
	    }
	    /**
	     * Updates the price of a food order in the database based on its item code.
	     *
	     * @param itemCode the item code of the food order to be updated
	     * @param amount   the amount by which the price should be updated
	     * @return {@code true} if the price is successfully updated, {@code false} otherwise
	     */

	    public boolean updatePrice(int itemCode, double amount) {
	        FoodOrder foodOrder = searchFoodOrder(itemCode);
	        if (foodOrder != null) {
	       
	        	foodOrder.setPrice(foodOrder.getPrice() + amount);
	            System.out.println("Price updated");
	            return true;
	        } else {
	            System.out.println("Unable to update, check your item code");
	            return false;
	        }
	    }
	    /**
	     * Deletes a food order from the database based on its item code.
	     *
	     * @param itemCode the item code of the food order to be deleted
	     * @return {@code true} if the food order is successfully deleted, {@code false} otherwise
	     */

	    public boolean deleteFoodOrder(int itemCode) {
	        boolean isDeleted = false;
	        for (int i = 0; i < foodOrders.length; i++) {
	            if (foodOrders[i] != null && foodOrders[i].getItemCode() == itemCode) {
	                System.out.println("Food order found in database and deleted");
	                foodOrders[i] = null;
	                isDeleted = true;
	                orderCount--;
	            }
	       }
	        if (!isDeleted) {
	            System.out.println("Food order is not found in database");
	        }
	        return isDeleted;
	    }
	}
