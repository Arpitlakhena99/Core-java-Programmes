package strings;

public class string17 {
public static void main(String[] args) {
  int n = 12;
  String[] s= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
String ans=""; int rem=0;
while(n!=0)
{
	rem=n%10;
	ans =s
[rem]+ans;
	n=n/10;
}
}
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
//	  if (n == 0) {
//	  System.out.println(s[0]);
//	     }
//	
//	  int d = 1;
//	  while (n / d >= 10) {
//	  d*= 10;
//	        }
//	  
//	  while (d> 0) {
//	  int digit = n / d;
//	  System.out.print(s[digit]);
//
//	  n %= d;
//	  d/=10;
//	     }
//	   }
//	}