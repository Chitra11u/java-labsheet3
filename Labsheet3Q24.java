import java.util.Scanner;
public class Labsheet3Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int newSize = n;
        for(int i = 0; i < newSize; i++) {
            for(int j = i + 1; j < newSize; j++) {
                if(arr[i] == arr[j]) {
                    for(int k = j; k < newSize - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newSize--;
                    j--;
                }
            }
        }
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
