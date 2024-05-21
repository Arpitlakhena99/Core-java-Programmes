package programming;

public class armstrong1{
    public static void main(String[] args) {
        int num = 9474; // Replace this with the number you want to check
        int digitCount = 0;
        int temp = num;
        int result = 0;
        
        // Count digits in the number
        while (temp != 0)
        {
            temp /= 10;
            ++digitCount;
        }
        temp = num;
        // Calculate result
        while (temp != 0) {
            int remainder = temp % 10;
            int power = 1;

            // Perform exponentiation manually
            for (int i = 0; i < digitCount; ++i) {
                power *= remainder;
            }
            result += power;
            temp /= 10;
        }

        // Check if the number is Armstrong
        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
