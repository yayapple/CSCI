import java.util.Scanner;

public class Windchill4 {
    public static void main(String[] args) {
        double windchill, temp, speed;
        Scanner scnr = new Scanner(System.in);

        System.out.print("\nEnter current temperature: ");
        temp = Double.valueOf(scnr.nextLine());
        System.out.print("\nEnter starting wind speed: ");
        speed = Double.valueOf(scnr.nextLine());

        if (speed < 0) {
          throw new Error("windspeed must be higher than 0");
        } else {
            System.out.println("Temperature  Wind  Windchill");
            System.out.println("-".repeat(30));
            for (int i = 0; i < 15; i++) {
                double currentSpeed = speed + i;
                windchill = (currentSpeed < 4) ? temp : (0.6215 * temp) - (35.75 * Math.pow(currentSpeed, 0.16)) + (0.4275 * temp * Math.pow(currentSpeed, 0.16)) + 35.74;
                System.out.printf("   %4.1f      %4.1f     %4.1f%n", temp, currentSpeed, windchill);
                if (i % 5 == 4) {
                    System.out.println("-".repeat(30));
                }
            }
        } 
    }
}