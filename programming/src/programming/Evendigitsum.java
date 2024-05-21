package programming;
public class Evendigitsum {
    public static void main(String[] args) {
        int number = 123456789; // Replace this with your desired number

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        System.out.println("The sum of even digits in the number is: " + sum);
    }
}
