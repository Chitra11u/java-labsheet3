import java.util.Scanner;
public class Labsheet3Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int zeroCount = 0;
        int nonZeroCount = 0;
        System.out.println("Enter elements:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                if(mat[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }
        if(zeroCount > nonZeroCount) {
            System.out.println("The matrix is a sparse matrix (Zero count: " + zeroCount + ", Non-zero count: " + nonZeroCount + ")");
        } else {
            System.out.println("The matrix is NOT a sparse matrix (Zero count: " + zeroCount + ", Non-zero count: " + nonZeroCount + ")");
        }
    }
}
