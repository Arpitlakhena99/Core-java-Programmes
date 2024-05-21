package filehandling;
import java.io.File;
import java.io.IOException;

public class FileDemo {
	
public static void main(String[] args) {
	File f1 = new File("demo.txt");
		try {
			f1.createNewFile();
			System.out.println("File Created...!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
