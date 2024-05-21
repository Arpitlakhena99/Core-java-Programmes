package programming;

public class largestofthree {

    public static void main(String[] args) {
     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a=33;
        int b=44;
        int c=2;
     if (a >= b && a >= c)
     {
         System.out.println(a);
     }
else if (b >= a && b >= c)
{
    System.out.println(b);
}
else
        {
            System.out.println(c);
        }  
    }
}