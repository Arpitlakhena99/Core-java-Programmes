package programming;

public class count {
	   public static void main(String args[]){
	      int count = 0;
	      int num = 23432;
	      while(num!=0){
	         num = num/10;
	         count++;
	      }
	      System.out.println("Number of digits in the entered integer are :: "+count);
	    }
	}
