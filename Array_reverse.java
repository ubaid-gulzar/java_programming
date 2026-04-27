// Write a Java program to read n elements in a one-dimensional array and display the elements in reverse order and count the number of even and odd elements.
import java.util.Scanner;

public class Array_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int even = 0, odd = 0;
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.print("Reverse array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEven count = " + even);
        System.out.println("Odd count = " + odd);
    }
}