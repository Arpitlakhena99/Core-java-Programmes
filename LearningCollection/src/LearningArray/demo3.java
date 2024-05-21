package LearningArray;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	public class demo3{
	    public static void main(String[] args) throws IOException {
	        FileReader f1=new FileReader("demofile.txt");
	        try (BufferedReader b1 = new BufferedReader(f1)) {
				int Count = 0;
				while (b1.readLine()!=null) {
				    Count++;
				}
				System.out.println("Total lines in the file:"+Count);
			}
	    }
	} 
