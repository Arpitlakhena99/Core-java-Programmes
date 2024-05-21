package LearningArray;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		ArrayList <Integer> l1 = new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
		int value=ip.nextInt();
		l1.add(value);
		}
		ip.close();
	LinkedHashSet<Integer> s1 =new LinkedHashSet<Integer>(l1);
	System.out.println(s1);
	}

}
