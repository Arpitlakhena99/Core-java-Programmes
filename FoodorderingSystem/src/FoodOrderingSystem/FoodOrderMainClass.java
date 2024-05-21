package FoodOrderingSystem;
/**
 * The {@code FoodOrderMainClass} contains the main method for testing the food ordering system.
 * It creates instances of the {@code FoodOrder} class, adds them to the database, performs operations,
 * and displays the results.
 */
public class FoodOrderMainClass {
	 /**
     * The main method for testing the food ordering system.
     *
     * @param args the command-line arguments (not used)
     */
	    public static void main(String[] args) {
	    	 // Implementation...
	        OrderCreation orderCreation = new OrderCreation();
	        FoodOrder foodOrder1 = orderCreation.createFoodOrder("Burger", 101, 50.00);
	        FoodOrder foodOrder2 = orderCreation.createFoodOrder("Pizza", 102, 150.00);
	        FoodOrder foodOrder3 = orderCreation.createFoodOrder("Salad", 103, 100.00);
	        FoodOrder foodOrder4 = orderCreation.createFoodOrder("Pasta", 104, 250.00);
	        FoodOrder foodOrder5 = orderCreation.createFoodOrder("Ice Cream", 105,400.00);

	        OrderDb orderDb = new OrderDb(5);

	        orderDb.addFoodOrder(foodOrder1);
	        orderDb.addFoodOrder(foodOrder2);
	        orderDb.addFoodOrder(foodOrder3);
	        orderDb.addFoodOrder(foodOrder4);
	        orderDb.addFoodOrder(foodOrder5);

	        System.out.println("Total Food Orders: " + orderDb.getOrderCount());

	        orderDb.viewFullDatabase();

	        System.out.println();
	        FoodOrder searchedFoodOrder = orderDb.searchFoodOrder(103);
	        if (searchedFoodOrder != null) {
	            System.out.println("Searched Food Order: " + searchedFoodOrder.getItemName() + " " + searchedFoodOrder.getItemCode() + " " + searchedFoodOrder.getPrice());
	        } else {
	            System.out.println("Food Order not found");
	        }

	        orderDb.updatePrice(103, 1.00);
	        orderDb.viewFullDatabase();

	        orderDb.deleteFoodOrder(103);
	        orderDb.viewFullDatabase();

	        System.out.println("Total Food Orders: " + orderDb.getOrderCount());
	    }
	}
