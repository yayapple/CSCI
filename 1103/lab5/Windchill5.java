import java.util.Scanner;
import java.lang.Math;

public class Windchill5 {
    public static void main(String[] args) {
        int temp, windchill;
        int[] speeds = {5, 10, 15, 20, 25};
        Scanner scnr = new Scanner(System.in);

        System.out.print("\nEnter current temperature: ");
        temp = scnr.nextInt();
        scnr.close();

        // Print header
        System.out.print("      temp");
        for (int i = 0; i < speeds.length; i++) {
            System.out.printf("%10s", "Wind=" + speeds[i]);
        }
        System.out.println();
        
        // Print values
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                System.out.println("-".repeat(60));
            }

            int currTemp = temp - i;
            System.out.printf("%10d", currTemp);

            for (int j = 0; j < speeds.length; j++) {
                int currentSpeed = speeds[j];
                windchill = (int) Math.round((0.6215 * currTemp) - (35.75 * Math.pow(currentSpeed, 0.16)) + (0.4275 * currTemp * Math.pow(currentSpeed, 0.16)) + 35.74);
                System.out.printf("%10d", windchill);
            }  

            System.out.println();
        } 
    }
}