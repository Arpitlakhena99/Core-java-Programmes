package loopspractice;
public class pattern31 {
public static void main(String[] args) {
	int[] arr = {2, 4, 6, 7, 4, 5};
	int target = 10;
	combination(arr, target);
	    }
 public static void combination(int[] n, int target) {
      for (int i = 0; i < n.length; i++) 
      {
	  for (int j = i + 1; j < n.length; j++)
	  {
	  if (n[i] + n[j] == target) {
	  System.out.println("Pair found: " + n[i] + ", " + n[j]);
	      }
	    }
	  }
    }
  }