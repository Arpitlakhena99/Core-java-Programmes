package sortings;
import java.util.Scanner;
public class makemebig {
public static void main(String[] args) {
	/**method 1
	 * without sorting 
	 * taking values by user	
	 */
	  Scanner ip = new Scanner(System.in);
	  System.out.print("Enter a number: ");
	  int number = ip.nextInt();     
	  int result = makeMeBig(number);
	  System.out.println("Output: " + result);
	    }
	/**reverse the elements
	 * 
	 * @param input
	 * @return
	 */
	  static int makeMeBig(int input) {
	  int[]n=new int[10];
	  while (input>0) {
	  int n1=input%10;
	  n[n1]++;
	  input/=10; //4321
	     }
	  
	   /**
	    * sorting the element in descending order 
	    * and printing the elements into the variable res
	    */
      int res=0;
      for (int i=9;i>=0;i--) {
	  while (n[i]>0) {
	  res=res*10+i;
	   n[i]--;
	      }
	    }
	  return res;
	    }
	}