import java.lang.Math;
import java.util.Scanner;

public class powers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        int power = Integer.valueOf(scnr.nextLine());
        scnr.close();

        if (power < 0) {
            System.out.println("base must be 0 or greater");
            System.exit(0);
        }
        
        System.out.printf("Powers of: %d%n", power);
        System.out.println("b    n    b^n");

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d   %2d    %d%n", power, i, (int)Math.pow(power, i));
        }
    }
}