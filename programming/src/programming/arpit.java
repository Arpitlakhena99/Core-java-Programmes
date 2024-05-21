package programming;


public class arpit{ 

static  void loop(int n)
{
    int i;
    int j;
    for (i = 1; i <= n; i++) 
    { 
        for (j = 1; j <= i; j++) { 


            if ((i + j) % 2 == 0) { 

                System.out.print(1 + " "); 

            } 
            else { 

                System.out.print(0 + " "); 

            } 
        } 

        System.out.println(); 

    } 

}
   
    public static void main (String [] args) 

    { 
      loop(5);
    }
}