package loopspractice;

public class pattern8 {
    public static void printNumbers(int n) {
        if (n >= 1) {
            System.out.println(n); 
            printNumbers(n - 1); 
            System.out.println(n);  
        }
    }
    public static void main(String[] args) {
        int i = 3;
        printNumbers(i);
    }
}
