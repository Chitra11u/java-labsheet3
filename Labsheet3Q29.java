import java.util.Scanner;
public class Labsheet3Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in jagged array:");
        int r = sc.nextInt();
        int[][] arr = new int[r][];
        for(int i = 0; i < r; i++) {
            System.out.println("Enter number of columns for row " + i + ":");
            int c = sc.nextInt();
            arr[i] = new int[c];
            System.out.println("Enter " + c + " elements for row " + i + ":");
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length - 1; j++) {
                for(int k = 0; k < arr[i].length - 1 - j; k++) {
                    if(arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Jagged array after sorting each row:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
