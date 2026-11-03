import java.util.Scanner;
public class Labsheet3Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];
        int sum = 0;
        System.out.println("Enter elements for 2x2x2 3-D array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                    sum += arr[i][j][k];
                }
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
