import java.util.Scanner;
public class Labsheet3Q11 {
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
        System.out.println("Transpose of the matrix:");
        for(int j = 0; j < c; j++) {
            for(int i = 0; i < r; i++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
