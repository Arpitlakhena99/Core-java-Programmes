package filehandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

  public class Main {
  public static void main(String[] args) {
 Person[] p1= {new Person("Arpit", 25, "Male"),new Person("Manan", 23,"Male"),new Person("Mouneesh",25,"Male")};
 
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("demo.txt"))) 
		{
			for(Person person : p1)
			{
				outputStream.writeObject(person);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("demo.txt")))
		{
		Object o1;
		while ((o1=inputStream.readObject()) != null) {
				Person person=(Person) o1;
				System.out.println(person);
			}
		} catch(EOFException e)
		{
		} 
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
