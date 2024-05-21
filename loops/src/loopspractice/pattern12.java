package loopspractice;
import java.util.Scanner;
public class pattern12 {
	//calculator
	
	    static int add(int n1, int n2) {
	        return n1 + n2;
	    }
	    static int sub(int n1, int n2) {
	        return n1 - n2;
	    }
	    static int mul(int n1, int n2) {
	        return n1 * n2;
	    }
	    static int div(int n1, int n2) {
	        return n1 / n2;
	    }
	    static int mod(int n1, int n2) {
	        return n1 % n2;
	    }
	    public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);
	        System.out.println("---------Welcome to Simple Calculator------------");
	        while (true) {
	            System.out.println("-----Menu------");
	            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Modulus\n6. Exit");
	            System.out.println("Enter your option");
	            int op = ip.nextInt();

	            if (op >= 1 && op <= 5) {
	                System.out.println("Enter two numbers:");
	                System.out.println("ENTER FIRST NUMBER");
	                int num1 = ip.nextInt();
	                System.out.println("ENTER SECOND NUMBER");
	                int num2 = ip.nextInt();
	                int result = 0;

	                switch (op) {
	                    case 1:
	                        result = add(num1, num2);
	                        break;
	                    case 2:
	                        result = sub(num1, num2);
	                        break;
	                    case 3:
	                        result = mul(num1, num2);
	                        break;
	                    case 4:
	                        result = div(num1, num2);
	                        break;
	                    case 5:
	                        result = mod(num1, num2);
	                        break;
	                }
	                System.out.println("Result: " + result);
	            } else if (op == 6) {
	                System.out.println("Exiting... Thank you!");
	                break;
	            } else {
	                System.out.println("Invalid option! Please choose a valid option.");
	            }
	        }
	        ip.close();
	    }
	}
