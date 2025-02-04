import java.util.Scanner;

public class missingnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the size of the list (n)
        System.out.println("Enter the value of n (total numbers including the missing one):");
        int n = scanner.nextInt();  // Example: n = 5

        // Step 2: Input the array
        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " numbers:");
        int actualSum = 0;

        // Calculate the sum of the array
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();  // Example input: 1, 2, 3, 5
            actualSum += arr[i];
        }

        // Step 3: Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;  // Example: 5 * (5 + 1) / 2 = 15

        // Step 4: Find the missing number
        int missingNumber = expectedSum - actualSum;  // Example: 15 - 11 = 4
        System.out.println("The missing number is: " + missingNumber);
    }
}

