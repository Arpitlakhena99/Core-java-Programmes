package sortings;

public class bubblesort3 {
public static void main(String[] args) {

	String input = "apple";
	char[] arr = input.toCharArray();

     // Bubble sort algorithm to sort characters
	 for(int a =0;a<arr.length-1;a++) {
	 for (int b=0; b<arr.length-1- a; b++) {
	 // Compare adjacent characters and swap if necessary
	 if (arr[b]>arr[b+1]) {
	  // Swap using a temporary variable (c)
	   char c =arr[b];
	   arr[b] =arr[b + 1];
	   arr[b+1] = c;
	      }
	     }
	    }
   System.out.print("Sorted String: ");
	for (char c : arr) {
	 System.out.print(c);
	   }
	}
  }
