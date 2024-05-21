package loopspractice;

public class pattern11 {
    public static void main(String[] args) 
    {
        int count = 10;
        for (int i = 0; i < count; i++) {
        System.out.print(fibonacci(i) + " ");
        }
    }
     public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}