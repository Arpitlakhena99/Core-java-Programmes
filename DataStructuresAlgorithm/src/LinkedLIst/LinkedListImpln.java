package LinkedLIst;

public class LinkedListImpln {
Node head;
void insert(int ele)
{
	Node n=new Node(ele);
	if(head==null) {
		head =n;
		
	}
	else {
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	System.out.println("the element " +ele+" had been inserted to linked list");
}
	void display(){
		System.out.println("Linked List data");
		if(head == null)
		{
			System.out.println("linked list is empty");
		}
		else {
			
    Node temp=head;
    while(temp!=null) {
        System.out.print(temp.data + " | ");
        temp=temp.next;
    }
    System.out.println("null");
       }
     }
	void delete(int value) {
	if(head ==null)
	{
		System.out.println("Linked list is empty");
	}
	else if(head.next==null) {
		head =null;
	}
	else {
		Node temp = head;
		while(temp.next.next!=null)
		{
			temp= temp.next;
		}
		temp.next= null;
	}
	}
	 void insertAtFront(int value) {
	      Node newN=new Node(value);
	      if(head==null) {
	      head=newN;
	     }else{
	       newN.next=head;
	        head = newN;
	      }
 System.out.println(" The element |"+value+"| has been inserted at the front of the linked list.");
	    }
	 void deleteFront(int value)
	 {
		 if(head ==null)
		 {
			 System.out.println("empty");
			 
		 }
		 else {
			head = head .next;
		 }
	 }

}