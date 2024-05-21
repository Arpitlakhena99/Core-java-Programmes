package filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class DemoDelete {
    public static void main(String[] args) {
        //create file obj using file class
        File f1=new File("file1.txt");
        if (f1.exists()) {
            if (f1.delete()) {
                System.out.println("deleted..!!!");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
