package loopspractice;

public class pattern5 {
    public static void printHello(int n) {
        if (n >=1) {
            System.out.println("Hello");
            printHello(n - 1);
        }
    }
    public static void main(String[] args) {
        int t = 5;
        System.out.println("Start");
        printHello(t);
        System.out.println("End");
    }
}

