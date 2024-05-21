package programming;

public class armstrong2 {
    static int count(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        return c;
    }
    static int power(int base ,int ex)
    {
        int pow=1;
        for(int i=1;i<=ex;i++)
        {
            pow=pow*base;
        }
        return pow;
    }
    public static void main(String [] agrs)
    {
int n=153, n1=n;
int rem=0,sum=0;
int ex=count(n);
while(n!=0)
{
    rem=n%10;
    sum=sum+power(rem,ex);
    n=n/10;
}
if (sum==n1)
{
    System.out.println("armstrong");
}
else{
    System.out.println("not armstrong");
}

    }
}
