// Mini Challenge

// Write a Student Grade Calculator.

// Input:

// Name
// Marks in 5 subjects

// Output:

// Total
// Average
// Grade

// Grade Rules:

// 90+  A
// 80+  B
// 70+  C
// 60+  D
// Below 60 Fail

// Example:

// Enter Name: Rahul

// Marks:
// 90
// 85
// 77
// 66
// 95

// Output

// Student : Rahul

// Total : 413

// Average : 82.6

// Grade : B

import java.util.*;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Marks:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 5.0;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nStudent : " + name);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade : " + grade);
        sc.close();
    }
}
