package programming;

import java.util.Scanner;

public class prime {
    static boolean isprime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        return c==2;
    }
    public static void main(String [] agrs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        for(int i=1; ;i++)
        {
        	if(n!=c) {
            if(isprime(i))
            {
           System.out.println(i);
           c++;
            }
        }}
       
    }
    
}
