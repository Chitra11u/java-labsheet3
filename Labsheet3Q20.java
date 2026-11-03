import java.util.Scanner;
public class Labsheet3Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int students = sc.nextInt();
        int[][] marks = new int[students][];
        for(int i = 0; i < students; i++) {
            System.out.println("Enter number of subjects for student " + (i + 1) + ":");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];
            System.out.println("Enter marks for " + subjects + " subjects:");
            for(int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMarks of students:");
        for(int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
