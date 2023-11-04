import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Subjects:");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter your marks in subject  " + i + ":");
            int marks = sc.nextInt();
            total += marks; 
        }

        double avg = (double) total / n;

        char grade;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);

        sc.close(); 
    }
}


