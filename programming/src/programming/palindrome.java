package programming;

public class palindrome {
 public static void main(String[] args) {
        int num=157; // Change this number to test different values
        int n=num; // Corrected variable name

        int rev=0,rem;
        while (n!=0) {
        rem = n%10;
        rev = (rev*10)+rem;
          n = n/10;
        }

        System.out.println(num==rev ?"palindrome":"not palindrome");
    }
}
