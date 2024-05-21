package foreachloop;
public class foreach3 {
public static void main(String[] args) {
	      
int[] arr = {2, 5, 3, 9, 1, 8, 4};
for (int i = 0; i < arr.length; i++) {
	    int sum = 0;
	    for (int j = i + 1; j < arr.length; j++) {
	    sum += arr[j];
	        }
	    arr[i] = sum;
	        }
	    for (int value : arr) {
	    System.out.print(value + " ");
	    }
	  }
	}