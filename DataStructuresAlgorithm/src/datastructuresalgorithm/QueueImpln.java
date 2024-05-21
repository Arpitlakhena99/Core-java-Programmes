package datastructuresalgorithm;

public class QueueImpln {	
	/**
	 * A simple implementation of a queue using arrays.
	 */
	    private int[] arr;      
	    private int front, rear; 
	    private int size; 

	    /**
	     * Constructor to initialize the queue with a given size.
	     *
	     * @param size The maximum size of the queue.
	     */
	    public QueueImpln(int size) {
	        arr = new int[size];
	        front = 0;
	        rear = -1;
	        this.size = 0;
	    }

	    /**
	     * Insert an element at the rear of the queue.
	     *
	     * @param value The value to be inserted.
	     */
	    public void insert(int value) {
	        if (rear == arr.length - 1) {
	            rear = -1;  // Wrap around
	        }
	        arr[++rear] = value;
	        size++;
	    }

	    /**
	     * Remove an element from the front of the queue.
	     *
	     * @return The removed element.
	     */
	    public int remove() {
	        int temp = arr[front++];
	        if (front == arr.length) {
	            front = 0;  // Wrap around
	        }
	        size--;
	        return temp;
	    }

	    /**
	     * Get the element at the front of the queue without removing it.
	     *
	     * @return The element at the front of the queue.
	     */
	    public int peek() {
	        return arr[front];
	    }

	    /**
	     * Check if the queue is empty.
	     *
	     * @return True if the queue is empty, false otherwise.
	     */
	    public boolean isEmpty() {
	        return size == 0;
	    }
	    /**
	     * Check if the queue is full.
	     *
	     * @return True if the queue is full, false otherwise.
	     */
	    public boolean isFull() {
	        return size == arr.length;
	    }
	}
