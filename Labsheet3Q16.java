import java.util.Scanner;
public class Labsheet3Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];
        int pos = 0, neg = 0;
        System.out.println("Enter elements for 2x2x2 3-D array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                    if(arr[i][j][k] > 0) {
                        pos++;
                    } else if(arr[i][j][k] < 0) {
                        neg++;
                    }
                }
            }
        }
        System.out.println("Positive numbers count: " + pos);
        System.out.println("Negative numbers count: " + neg);
    }
}
