import java.util.Scanner;
public class Labsheet3Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int sum = 0;
        System.out.println("Enter elements:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                sum += mat[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
