package loopspractice;

public class pattern6 {
    public static void reverse(int n) {
        if (n >= 1) {
            System.out.println(n);
            reverse(n - 1); 
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Start countdowan");
        reverse(n);
        System.out.println("Stop countdowan");

    }
}
    

