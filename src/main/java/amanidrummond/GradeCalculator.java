package amanidrummond;

import java.util.Scanner;

// This program calculates a student's average grade
// and assigns a letter grade based on the average.
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user how many grades
        System.out.print("How many grades do you want to enter? ");
        int numberOfGrades = scanner.nextInt();

        double total = 0;

        // Collect grades
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();
            total += grade;
        }

        // Calculate average
        double average = total / numberOfGrades;

        // Determine letter grade
        String letterGrade;

        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Output results
        System.out.println("Average: " + average);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}
