package programming;
import java.util.Scanner;

public class olafare {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter distance in kilometers: ");
     int distance = scanner.nextInt();
     scanner.close();

     int fare = 0;
     int remaining = distance;

     if (remaining >= 2) {
         fare += (remaining < 2) ? remaining * 25 : 2 * 25;
         remaining -= 2;
     }

     if (remaining > 0) {
         fare += (remaining < 5) ? remaining * 15 : 5 * 15;
         remaining -= 5;
     }

     if (remaining > 0) {
         fare += (remaining < 5) ? remaining * 20 : 5 * 20;
         remaining -= 5;
     }

     if (remaining > 0) {
         fare += remaining * 25;
     }

     System.out.println("Total fare: " + fare);
 }
}
