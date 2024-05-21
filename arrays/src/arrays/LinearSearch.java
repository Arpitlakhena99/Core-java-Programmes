package arrays;

public class LinearSearch {

    // Method to perform linear search and return the index
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // Return -1 if the key is not found
    }
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {43, 4, 5, 1, 2, 8, 25};
		System.out.println(search(arr,8));
    }
}

