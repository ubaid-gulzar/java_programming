// Write a Java program to check whether a given matrix is symmetric using a two-dimensional array.
import java.util.*;

public class Check_symmetric_of_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        boolean symmetric = true;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] != mat[j][i])
                    symmetric = false;

        System.out.println(symmetric ? "Symmetric" : "Not Symmetric");
    }
}