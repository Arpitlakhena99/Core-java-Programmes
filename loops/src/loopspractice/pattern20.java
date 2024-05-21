package loopspractice;

public class pattern20 {
        public static void main(String[] args) {
            int rows = 5;
            int columns = 7;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (i == 0 || j == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
