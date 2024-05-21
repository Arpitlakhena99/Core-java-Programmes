package loopspractice;

public class pattern10 {
    public static void main(String[] args) {
        int number = 5;
        long factorial = Factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    public static long Factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * Factorial(n - 1);
    }
}


