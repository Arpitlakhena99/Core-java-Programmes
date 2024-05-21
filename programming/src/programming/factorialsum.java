package programming;

public class factorialsum {
    public static void main(String[] args) {
        int number = 145;
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            temp /= 10;
        }

        System.out.println(number + (sum == number ? " is " : " is not"));
    }
}
