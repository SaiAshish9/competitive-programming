import java.io.*;

public class Main {

    public static PrintStream ps = System.out;

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
    }

    public static void display(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                ps.print(j + " ");
            }
            ps.println("");
        }
    }

    public static void main(String... s) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        display(arr);
        rotate(arr);
        ps.println("################");
        display(arr);
    }
}