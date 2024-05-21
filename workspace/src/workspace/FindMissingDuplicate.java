package workspace;
import java.util.Scanner;

public class FindMissingDuplicate {

  public static int[] findDuplicateAndMissing(int[] nums) {
    // Create an array to store the count of each number (1 to n)
    int[] counts = new int[nums.length + 1];

    // Iterate through the list and update counts
    for (int num : nums) {
      counts[num]++;
      if (counts[num] > 1) {
        // If count is greater than 1, it's the duplicate
        return new int[]{num, -1}; // Return duplicate and placeholder for missing
      }
    }

    // Find the missing number by finding the index with a count of 0
    for (int i = 1; i < counts.length; i++) {
      if (counts[i] == 0) {
        return new int[]{nums[0], i}; // Return placeholder and missing number
      }
    }

    // This shouldn't happen if input is valid (all numbers present once)
    throw new IllegalArgumentException("No duplicate or missing number found");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();

    int[] nums = new int[n];
    System.out.print("Enter the elements (separated by spaces): ");
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    int[] results = findDuplicateAndMissing(nums);
    System.out.println("Duplicate: " + results[0] + ", Missing: " + results[1]);

    scanner.close();
  }
}
