package programming;

public class perfect
{

    public static void main(String[] args) {
        int num = 28; // Change this number to test different values
        int sum = 0;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
