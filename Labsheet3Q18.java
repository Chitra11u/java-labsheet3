import java.util.Scanner;
public class Labsheet3Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];
        System.out.println("Enter elements for 2x2x2 3-D array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Enter element to search:");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    if(arr[i][j][k] == target) {
                        System.out.println("Element found at position: [" + i + "][" + j + "][" + k + "]");
                        found = true;
                    }
                }
            }
        }
        if(!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
