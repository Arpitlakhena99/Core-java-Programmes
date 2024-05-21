package programming;

//the sum of digits raised to the power of 2 (7^2 + 2^2 + 4^2) in the
//number 724 equals 77 in base 10.
public class Base2 {
public static void main(String[] args) {
   int n = 724;
   int exp = 2;
   int res = 0;

   while (n > 0) {
       int mod = n % 10;
       int powered = 1;
       for (int i = 0; i < exp; i++) {
           powered *= mod;
       }
       res += powered;
       n /= 10;
   }

   System.out.println(res);
}
}

