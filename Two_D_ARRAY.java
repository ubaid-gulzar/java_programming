// Write a Java program to read a matrix using a two-dimensional array and compute the sum of each row and each column.
import java.util.Scanner;

public class Two_D_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 2D array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter the elements of 2D array: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) sum += mat[i][j];
            System.out.println("Row " + i + " sum = " + sum);
        }

        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) sum += mat[i][j];
            System.out.println("Column " + j + " sum = " + sum);
        }
    }
}