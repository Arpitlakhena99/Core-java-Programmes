package programming;

import java.util.Scanner;

public class awesomestudent
{
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner scanner = new Scanner(System.in);
	        int studentId = scanner.nextInt();
	        int originalNumber = studentId;
	        int sumFactorialDigits = 0;
	        int temp;
	        while (studentId > 0) {
	            temp = 1;
	            int digit = studentId % 10;
	            for (int j = 1; j <= digit; j++) {
	                temp *= j;
	            }
	            sumFactorialDigits += temp;
	            studentId /= 10;
	        }
	        String output;
	        if (sumFactorialDigits == originalNumber) {
	            output = "awesome student";
	        } else {
	            output = "not a awesome student";
	        }

	        System.out.println(output);
	    }
}