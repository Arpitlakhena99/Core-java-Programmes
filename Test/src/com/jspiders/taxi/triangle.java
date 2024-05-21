












































































































































iders.taxi;

public class triangle {
    public static void main(String [] agrs)
    {
        int i,j,k;
        int a=1;
        for(i=1;i<=9;i++)
        {
            for(k=9;k>i;k--)
            {
                System.out.println("");
            }
            for(j=1;j<=i;j++)
            {
                if(i%2==1)
                System.out.println(a+" ");

            }
            if(i%2==1)
            ++a;
        }
    }
    
}
