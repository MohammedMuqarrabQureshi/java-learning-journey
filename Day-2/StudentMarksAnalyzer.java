// Input:

// Number of students
// Marks of each student

// Output:

// Highest Marks
// Lowest Marks
// Average Marks
// Number of students passed
// Number of students failed

import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        System.out.println("Enter the marks of each student:");

        int[] marks = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        // for highest marks
        int highestMarks = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highestMarks) {
                highestMarks = marks[i];
            }
        }
        // for lowest marks
        int lowestMarks = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < lowestMarks) {
                lowestMarks = marks[i];
            }
        }
        // for average marks
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double averageMarks = (double) sum / marks.length;
        // for number of students passed and failed
        int passedCount = 0;
        int failedCount = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 40) {
                passedCount++;
            } else {
                failedCount++;
            }
        }
        System.out.println("Highest Marks: " + highestMarks);
        System.out.println("Lowest Marks: " + lowestMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Number of students passed: " + passedCount);
        System.out.println("Number of students failed: " + failedCount);
    }
}
