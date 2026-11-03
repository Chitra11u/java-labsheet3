import java.util.Scanner;
public class Labsheet3Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix (n x n):");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int mainDiagSum = 0;
        int secDiagSum = 0;
        for(int i = 0; i < n; i++) {
            mainDiagSum += mat[i][i];
            secDiagSum += mat[i][n - 1 - i];
        }
        System.out.println("Main diagonal sum: " + mainDiagSum);
        System.out.println("Secondary diagonal sum: " + secDiagSum);
    }
}
