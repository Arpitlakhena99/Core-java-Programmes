package LearningArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Demo {
	public static void main(String[] args)throws IOException
	{
	BufferedReader b1= new BufferedReader(new InputStreamReader(System.in));
	String s=b1.readLine();
	System.out.println(s);
	int n=Integer.parseInt(b1.readLine());
	System.out.println(n+10);
	}

}
