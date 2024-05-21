package programming;

public class duck {
    public static void main(String[] args) {
        int number = 9772;
        int temp = number;
        boolean isDuck = false;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                isDuck = true;
                break;
            }
            temp /= 10;
        }
 
        if (number != 0 && isDuck) {
            System.out.println(number + " is a duck number.");
        } else {
            System.out.println(number + " is not a duck number.");
        }
    }
}
