package filehandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class mainEntity {
	public static void main(String[] args) {
		entity e = new entity("Arpit",123,80000);
		try {
			FileOutputStream f1 = new FileOutputStream("emp.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
