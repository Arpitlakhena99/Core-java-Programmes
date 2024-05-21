package programming;

public class PlusPattern {
    
    public static void main(String[] args) {
        int size = 5; // Define the size of the plus pattern

        // Printing the plus pattern
        for (int i = 0; i < size * 2 - 1; i++) {
            for (int j = 0; j < size * 2 - 1; j++) {
                if (j == size - 1 || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
