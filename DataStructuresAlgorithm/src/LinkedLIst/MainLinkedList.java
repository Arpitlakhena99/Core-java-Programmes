package LinkedLIst;
public class MainLinkedList {
public static void main(String[] args) {
	LinkedListImpln l1 = new LinkedListImpln();
	l1.insert(10);
	l1.insert(20);
	l1.insert(30);
	l1.insert(40);
	l1.insert(50);
	l1.display();
	 l1.delete(2);
     l1.display();

     l1.delete(1);
     l1.display();

     l1.delete(3);
     l1.display();

     l1.delete(0);
     l1.display();
     
     l1.delete(10);
     l1.display();
     System.out.println();
     l1.insertAtFront(5);
     l1.display();
}	
    }
