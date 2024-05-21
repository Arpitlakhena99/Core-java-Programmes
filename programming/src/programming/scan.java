package programming;
	import java.util.Scanner;

	public class scan{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int intValue = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Enter a string: ");
	        String stringValue = scanner.nextLine();
	        System.out.println("You entered the integer: " + intValue);
	        System.out.println("You entered the string: " + stringValue);
	        scanner.close();
	    }
	}
