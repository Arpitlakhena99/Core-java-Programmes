package programming;

public class neon {
    public static void main(String[] args) {
        int number = 9;
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        if (sumOfDigits == number) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }
    }
}
