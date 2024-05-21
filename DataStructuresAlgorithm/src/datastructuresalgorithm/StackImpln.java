package datastructuresalgorithm;

public class StackImpln {
	static  int[] stack;
	static int top;
	/**
	 * creating stack of size 50
	 * @param size
	 */
	static void createstack(int size)
	{
		stack = new int[size];
		top =-1;
		System.out.println("Stack had been created with size :"+size);
		
	}
	/**
	 * push /inserting the elements into the stack;
	 * @param rags
	 */
	static void push (int ele) {
		if(top==stack.length-1)
		{
			System.out.println("stack overflow..!!!");
		}
		else
		{
			top++;
			stack[top]=ele;
			System.out.println(ele+"had been inserted into stack....!!!");
		}
	}
	static void display ()
	{
		System.out.println("=======stack data===========");
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
		}
		System.out.println("================");
	}
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("stack underflow..!!");
		}
		else
		{
			System.out.println(stack[top]+"had been deleted..!!");
		stack[top]=0;
		top--;
		}
	}
	static boolean isEmpty() {
		return top==-1;
	}
	static boolean isFull()
	{
		
	return top ==stack.length-1;
	}
	public static void main(String[] args) {
		createstack(5);
		display();
		push(10);push(20);push(30);push(40);push(50);push(60);
		pop();pop();pop();pop();pop();display();pop();
		isEmpty();
		isFull();
	}

}
