import java.util.Scanner;

class Sequences {
    static int getTotalNumberOfSequences(int m, int n) {
        int T[][] = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0)
                    T[i][j] = 0;
                else if (i < j)
                    T[i][j] = 0;
                else if (j == 1)
                    T[i][j] = i;
                else
                    T[i][j] = T[i - 1][j] + T[i / 2][j - 1];
            }
        }
        return T[m][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum value (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the length of the sequence (n): ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Total number of possible sequences: " + getTotalNumberOfSequences(m, n));
    }
}
