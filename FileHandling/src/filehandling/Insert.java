package filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Insert {
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			try {
				FileWriter f1 = new FileWriter("demo.txt",true);
				System.out.println("enter the info");
				String msg=ip.nextLine();
				//f1.write(msg);
				f1.append(msg);
				f1.close();
				System.out.println("Data Inserted");
			}
		
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
	}

	}
