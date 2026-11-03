import java.util.Scanner;
public class Labsheet3Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter elements:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int j = 0; j < c; j++) {
            int colSum = 0;
            for(int i = 0; i < r; i++) {
                colSum += mat[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
    }
}
