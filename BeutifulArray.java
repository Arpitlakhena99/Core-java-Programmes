import java.util.Scanner;

public class BeutifulArray{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int targetSum = scanner.nextInt();
            int minLength = findMinLength(targetSum);
            System.out.println(minLength);
        }

        scanner.close();
    }

    private static int findMinLength(int targetSum) {
        int[] dp = new int[targetSum + 1]; // dp[i] stores the minimum length for a beautiful array with sum i

        // Base cases:
        dp[0] = 0; // Empty array for sum 0 has length 0
        dp[1] = 1; // Array of 1 for sum 1 has length 1

        // Build up the dp table
        for (int i = 2; i <= targetSum; i++) {
            // Consider all possible previous values (i-1, i-2)
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + 1;

            // Check if including i itself can lead to a smaller length
            if (i <= targetSum / 2 && dp[i / 2] < dp[i]) {
                dp[i] = dp[i / 2] + 1;
            }
        }

        return dp[targetSum];
    }
}
