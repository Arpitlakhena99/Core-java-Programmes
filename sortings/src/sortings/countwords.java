package sortings;

public class countwords {
public static void main(String[] args) {
	String str="hello how are you";
	int c=0;
	if(str.length()!=0)	
	{
	c=1;
	}
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)==' ')
	   {
        c++;
	   }
     }
    System.out.println(c);
         }
      }
