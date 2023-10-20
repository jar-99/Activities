package java6;

import java.util.Scanner;

public class TheSemestersAverage {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the student's midterm score: ");
    int midtermScore = scanner.nextInt();

    System.out.print("Enter the student's finals score: ");
    int finalsScore = scanner.nextInt();

    double semesterAverage = calculateSemesterAverage(midtermScore, finalsScore);

    System.out.println("Semester average = " + semesterAverage);
}

public static double calculateSemesterAverage(int midtermScore, int finalsScore) {

    if (Math.abs(midtermScore - finalsScore) < 10) {
        return (midtermScore + finalsScore) / 2.0;
    } else {
        return Math.max(midtermScore, finalsScore);
    }
}
}