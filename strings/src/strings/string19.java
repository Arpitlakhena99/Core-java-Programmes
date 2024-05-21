//i/p-764
//ex-7+6+4=17
//1+7=8--->output
package strings;
public class string19 {
public static int Digitroot(int n) {
  while (n >= 10) {
  int sum = 0;
	while (n> 0) {
	sum += n% 10;
	 n/= 10;
	   }
	 n= sum;
	  }
	return n;
	  }
public static void main(String[] args) {
  int n = 764;
  int res= Digitroot(n);
  System.out.println(res);
	  }
}
	
