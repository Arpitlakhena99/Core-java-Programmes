package programming;

public class PowerCalculator {
    public static void main(String[] args) {
        int base = 12;
        int exponent = 2;
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);
    }
}
