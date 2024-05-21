package LearningArray;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class demo2{
	public static void main(String[] args) throws IOException
{
		FileReader f1= new FileReader("demofile.txt");
		try (BufferedReader b1 = new BufferedReader(f1)) {
			System.out.println(b1.readLine());
			System.out.println(b1.readLine());
			System.out.println(b1.readLine());
			System.out.println(b1.readLine());
			System.out.println(b1.readLine());
			System.out.println(b1.readLine());
		}
		
	}

}