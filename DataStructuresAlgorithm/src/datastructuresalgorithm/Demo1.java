package datastructuresalgorithm;

import java.util.Scanner;

public class Demo1 {
static int[] queue;
static int front,rear;
static void CreateQueue(int size) {
	queue= new int [size];
	front =0; rear=0;
	System.out.println("queue had been created with the size :" +size);
}
static void enqueue(int ele)
{
	if(rear==queue.length) {
		System.out.println("queue is full...!!!!");
	}
	else {
		queue[rear]=ele;
		rear++;
		System.out.println(ele+"had been inserted into the queue");
	}
}
static void display() {
	System.out.println("queue data...!!!");
	if(rear==front) {
		System.out.println("queue is empty");
	}
	else {
		for(int i=front;i<rear;i++)
		{
			System.out.println(queue[i]);
		}
	}
	System.out.println("=================");
}
static void dequeue() {
    if (front == rear) {
        System.out.println("Queue is empty, cannot dequeue.");
    } else {
    	System.out.println(queue[front] + " has been dequeued.");
    	for(int i=front;i<rear-1;i++)
    	{	
    	queue[i]=queue[i+1];	
    	}
    	rear--;
    	queue[rear]=0;     
//front++;
    }
}
public static void main(String[] args) {
//	CreateQueue(10);display();
//	enqueue(10);enqueue(20);enqueue(30);enqueue(40);enqueue(50);
//	ezzxxxxxx520nqueue(60);enqueue(70);enqueue(80);enqueue(90);enqueue(100);
//	dequeue();dequeue(); dequeue();dequeue(); dequeue() ;dequeue();
//	dequeue(); dequeue(); dequeue(); dequeue();
//	display();
	Scanner ip =new Scanner(System.in);
	System.out.println("Queue DataStructure..!!");
	while(true)
	{
		System.out.println("====Menu====");
		System.out.println("1.CreateQueue\n2.Enqueue");
		System.out.println("3.Display\n4.Dequeue\n5.Exit");
		System.out.println("enter the option:-");
	 int op=ip.nextInt();
		switch(op)
		{
		case 1: System.out.println("enter the size:-");
		int size= ip.nextInt();
		CreateQueue(size);break;
		case 2: System.out.println("enter the element:-");
		int ele = ip.nextInt();
		enqueue(ele);break;
		case 3: display();
		case 4:dequeue();
		case 5: System.out.println("=====thankyou you====");
		System.exit(0);
		default:System.out.println("invalid option...!!!");
		}
	}
}
}







































