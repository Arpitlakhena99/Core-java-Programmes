package LearningArray;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class palindromic{
static void isPalindromic(String s)
{
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(rev.equals(s))
	{
		System.out.println(rev);
	}
}
public static void main(String[] args) throws IOException{
	FileReader f1= new FileReader("demofile.txt");
	try (BufferedReader b1 = new BufferedReader(f1)) {
		String s="";
		while((s=b1.readLine())!=null)
		{
			String[] arr=s.split(" ");
			for(String ele:arr)
			{
				isPalindromic(ele);
		      	}
		      }
	}
        }
     }