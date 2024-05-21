package programming;

public class composite {
	  public static void main(String [] args)
	  {
	    int i;
	    int n=12;
	    int s=0;
	    for(i=2;i<n;i++)
	    {
	        if(n%i==0)
	        {
	            s=1;
	        }
	    }
	    if(s==1)
	    {
	        System.out.println("number is composite");
	    }
	    else
	    {
	        System.out.println("not a composite");
	    }
	  }
	}
