// Write a Java program to read two one-dimensional arrays and merge them into a single array, then display the merged array in sorted order.
import java.util.*;

public class Merge_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter the elements of first array: ");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();
        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.print("Enter the elements of second array: ");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        int[] merged = new int[n1 + n2];

        for(int i =0; i<(n1+n2); i++){
            if(i < n1){
                merged[i] = a[i];
            }
            else{
                merged[i] = b[i-n1];
            }
        }

        Arrays.sort(merged);
        System.out.println("The sorted array are:");
        for (int i = 0; i< (n1+n2); i++){
            System.out.print(merged[i] + " ");
        };
    }
}