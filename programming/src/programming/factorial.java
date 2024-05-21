package programming;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // Input the number
        int number = ip.nextInt();

        // Calculate the factorial
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println(factorial);

        // Close the Scanner to release resources
        ip.close();
    }
}
