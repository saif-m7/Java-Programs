import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for 5 subjects: ");

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            int marks = sc.nextInt();
            total += marks;
        }

        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90)
            System.out.println("Grade: A+");
        else if (percentage >= 80)
            System.out.println("Grade: A");
        else if (percentage >= 70)
            System.out.println("Grade: B");
        else if (percentage >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");

        sc.close();
    }
}