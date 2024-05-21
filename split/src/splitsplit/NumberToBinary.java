package splitsplit;
import java.util.Scanner;
public class NumberToBinary {
 public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
	int d=ip.nextInt();
	String bi="";
	if(d==0) {
    bi="0";
	  } 
	else{
    while(d>0){
	bi=(d%2)+bi;
	d/=2;
	  }
   }
System.out.println("Binary representation: "+bi);
    }
 } 