package programming;

public class bike {
    String name;
    String model;
    int price;
    String color;

    bike() {
        System.out.println("hello Constructor");
    }

    bike(String n, String m) {
        this.name = n;
        this.model = m;
    }

    bike(int p, String n, String color) {
        this.price = p;
        this.name = n; // Corrected this line
        this.color = color;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.price);
    }

    public static void main(String[] args) {
        new bike();
        bike b2 = new bike("hayabusa", "zr10000");
        b2.display();
        bike b3 = new bike(324453, "hero", "black");
        b3.display();
    }
}
