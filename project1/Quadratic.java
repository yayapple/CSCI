import java.lang.Math;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double a = scnr.nextDouble();
        double b = scnr.nextDouble();
        double c = scnr.nextDouble();
        scnr.close();
        double discriminant = (b * b) - (4 * a * c);
        if (discriminant < 0) {
            System.out.println("Error, no real roots");
            System.exit(1);
        }
        double xplus = (-b + Math.sqrt(discriminant)) / (2 * a);
        double xminus = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.printf("x1 = %.2f, x2 = %.2f%n", xplus, xminus);
    }
}
