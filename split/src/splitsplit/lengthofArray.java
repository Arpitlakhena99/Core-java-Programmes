package splitsplit;

public class lengthofArray {
public static void main(String[] args) {
	  int[]arr={1, 2, 3, 4, 5};
	  int len=0;
	  try{
	  while(true) 
	     {
	     int n=arr[len];
	     len++;
	    }
	  }
	 catch(ArrayIndexOutOfBoundsException e) {
	 }
	System.out.println("Length of array: " + len);
	  }
}