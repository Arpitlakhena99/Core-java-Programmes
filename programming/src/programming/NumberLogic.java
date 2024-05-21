package programming;
//public class NumberLogic {
//public static void main(String[] args) {
//  int number = 87653; // Replace this with the number you want to check

//  int temp = number;
//  int count = 0;
//  while (temp != 0) {
//      temp /= 10;
//      ++count;
//  }

//  temp = number;

//  if (count % 2 != 0) {
//      System.out.println("Invalid number: Odd number of digits");
//  } else {
//      int half = count / 2;
//      int secondHalfValue = 0;
//      int firstHalfValue = 0;

//      for (int i = 0; i < count; ++i) {
//          int digit = temp % 10;
//          temp /= 10;

//          if (i < half) {
//              secondHalfValue = secondHalfValue * 10 + digit;
//          } else {
//              firstHalfValue = firstHalfValue * 10 + digit;
//          }
//      }

//      int sum = firstHalfValue + secondHalfValue;
//      System.out.println("Sum of halves: " + sum);
//  }
//}
public class NumberLogic {
public static void main(String[] args) {
 int number = 2025; // Replace this with the number you want to check

 int temp = number;
 int count = 0;
 while (temp != 0) {
     temp /= 10;
     ++count;
 }

 temp = number;

 if (count % 2 != 0) {
     System.out.println("Invalid number: Odd number of digits");
 } else {
     int half = count / 2;
     int secondHalf = 0;
     int firstHalf = 0;

     for (int i = 0; i < count; ++i) {
         int digit = temp % 10;
         temp /= 10;

         if (i < half) {
             secondHalf = secondHalf * 10 + digit;
         } else {
             firstHalf = firstHalf * 10 + digit;
         }
     }

     int sum = firstHalf + secondHalf;
     System.out.println("Sum: " + sum);

     // Reversing the sum
     int reversedSum = 0;
     while (sum != 0) {
         int digit = sum % 10;
         reversedSum = reversedSum * 10 + digit;
         sum /= 10;
     }

     System.out.println("Reversed sum: " + reversedSum);
 }
}
}
