package LearningQueueCollection;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class MainClass2 {
public static void main(String[] args) {
		System.out.println("---------------------------------");
		LinkedList q1 = new LinkedList();
		
//		q1.add("Varun");
//		q1.add("Srushti");
//		q1.add("Arpit");
//		q1.add("Manan");
//		q1.add("Mouneesh");
	
		q1.add(100);
		q1.add(45);
		q1.add(12);
		q1.add(5);
		q1.add(50);
		
//		System.out.println("Queue size:"+ q1.size());
//		System.out.println(q1);
//		System.out.println("Head Element:"+ q1.peek());
//		System.out.println("Queue size:"+ q1.size());
//		System.out.println(q1);
	
		Object element=q1.poll();
		while(element!=null)	
		{
			System.out.println(element);
			System.out.println("the element of linked list are : ");
			element=q1.poll();
		}
		System.out.println("---------------------------------");
	}

}
