package programming;
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1208;
        int rev = 0;
        
        System.out.println("Original number: " + num);
        
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed number: " + rev);
    }
}
