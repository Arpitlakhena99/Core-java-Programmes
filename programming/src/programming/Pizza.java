package programming;
public class Pizza {
    String type = "regular";
    int price = 150;
    String topping1;
    String topping2;
    boolean cheese;

    Pizza(boolean c) {
        this.cheese = c;
        if (c) {
            this.price = this.price + 80;
        }
    }

    Pizza(String t1, String t2) {
        this.topping1 = t1;
        this.topping2 = t2;
    }

    Pizza(String t1, String t2, boolean c) {
        this.topping1 = t1;
        this.topping2 = t2;
        this.cheese = c;
        if (c) {
            this.price = this.price + 80;
        }
    }

    void bill() {
        System.out.println("Type: " + this.type);
        System.out.println("Topping 1: " + this.topping1);
        System.out.println("Topping 2: " + this.topping2);
        System.out.println("Cheese: " + this.cheese);

        double gst = this.price * 0.10f; // Corrected the GST calculation
        double total = this.price + gst;
        System.out.println("GST: " + gst);
        System.out.println("Total: " + total);
        System.out.println();
    }

    public static void main(String[] args) {
        Pizza p1 = new Pizza("paneer", "mushroom", true);
        p1.bill();
        Pizza p2 = new Pizza(false);
        p2.bill();
    }
}
