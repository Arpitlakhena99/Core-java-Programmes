package programming;
public class PrimeNumberAtPosition {
    public static void main(String[] args) {
        int pos = 8; // Specify the position of the prime number to find
        int c= 0;
        int n = 2; // Start with the first prime number
        while (c< pos) {
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                  break;
                }
            }
            if (isPrime) {
                c++;
                if (c == pos) {
                    System.out.println("The prime number at position " + pos + " is: " + n);
                    break;
                }
            }
            n++;
        }
    }
}

