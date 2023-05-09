 import java.util.Scanner;

public class  prog7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

         
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

         
        int max = arr[0];
        int min = arr[0];
        int maxCount = 1;
        int minCount = 1;
        int maxFirstOccur = 0;
        int minLastOccur = 0;

         
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
                maxFirstOccur = i;
            } else if (arr[i] == max) {
                maxCount++;
            }
            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                minLastOccur = i;
            } else if (arr[i] == min) {
                minCount++;
                minLastOccur = i;
            }
        }

        // Print out the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum occurrences: " + maxCount);
        System.out.println("Minimum occurrences: " + minCount);
        System.out.println("Position of first occurrence of maximum: " + maxFirstOccur);
        System.out.println("Position of last occurrence of minimum: " + minLastOccur);
    }
}
