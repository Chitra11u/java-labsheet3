import java.util.Scanner;
public class Labsheet3Q19 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for row 0 (2 elements):");
        for(int i = 0; i < arr[0].length; i++) {
            arr[0][i] = sc.nextInt();
        }
        System.out.println("Enter elements for row 1 (4 elements):");
        for(int i = 0; i < arr[1].length; i++) {
            arr[1][i] = sc.nextInt();
        }
        System.out.println("Enter elements for row 2 (3 elements):");
        for(int i = 0; i < arr[2].length; i++) {
            arr[2][i] = sc.nextInt();
        }
        System.out.println("The jagged array elements are:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
