import java.util.Scanner;
import java.lang.Math;
public class Pennies {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter number of days worked (5-30 inclusive): ");
        int numDays = scnr.nextInt();

        if (numDays > 30 || numDays < 5) {
            System.out.println("Invalid number of days");
            System.exit(0);
        }

        System.out.println("Day    Salary");
        System.out.println("----   ----");

        int salaryCents = 0;
        int salarySum = 0;

        for (int i = 1; i <= numDays; i++) {
            salaryCents = (int) Math.pow(2, i-1);
            salarySum += salaryCents;
            System.out.printf("%2d      $%,d.%02d%n", i, salaryCents / 100, salaryCents % 100);
        }
        System.out.printf("Total salary earned: $%,d.%02d", salarySum / 100, salaryCents % 100);
    }
}