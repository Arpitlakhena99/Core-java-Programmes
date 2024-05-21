package filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class file2 {
    public static void main(String[] args) {
        File f1= new File("file1.txt");
        try{//file creation
            f1.createNewFile();
            System.out.println("file had been created");
        }catch(IOException e) {
            e.printStackTrace();
        }
        try{//writing the data inside file
            FileWriter w1=new FileWriter("file1.txt");
            w1.write("hello how are you!!");
            w1.close();
            System.out.println("data inserted");
        }catch(IOException e) {
            e.printStackTrace();
        }
        try{//reading the file
            FileReader r1=new FileReader("file1.txt");
            BufferedReader b1=new BufferedReader(r1);
            System.out.println("data inside file");
            String s;
            while((s=b1.readLine())!=null) {
                System.out.println(s);
            }
            b1.close();
        }catch(FileNotFoundException e){

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
