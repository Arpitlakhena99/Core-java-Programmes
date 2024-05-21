package LearningQueueCollection;
import java.util.PriorityQueue;
public class MainClass1 {
public static void main(String[] args) {
	System.out.println("---------------------------------");
	PriorityQueue q1= new PriorityQueue();		
	
	q1.add(100);
	q1.add(45);
	q1.add(12);
	q1.add(5);
	q1.add(50);
	
	System.out.println("queue size is :"+q1.size());
	System.out.println(q1);
	
	System.out.println("removing head element"+q1.poll());
	System.out.println("queue size is :"+q1.size());
	System.out.println(q1);
	
	System.out.println("removing head element"+q1.poll());
	System.out.println("queue size is :"+q1.size());
	System.out.println(q1);
	
	System.out.println("---------------------------------");
}
}
