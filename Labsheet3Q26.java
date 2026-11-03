import java.util.Scanner;
public class Labsheet3Q26 {
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
        System.out.println("Upper triangular part:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j >= i) {
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
        System.out.println("Lower triangular part:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j <= i) {
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}
