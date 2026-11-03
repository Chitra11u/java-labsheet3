import java.util.Scanner;
public class Labsheet3Q28 {
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
        System.out.println("Enter element to search:");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(mat[i][j] == target) {
                    System.out.println("Element found at row " + i + ", column " + j);
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("Element not found in the matrix.");
        }
    }
}
