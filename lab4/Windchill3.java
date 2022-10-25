import java.util.Scanner;

public class Windchill3 {
    public static void main(String[] args) {
        double windchill, temp, speed;
        Scanner scnr = new Scanner(System.in);
        scnr.close();

        System.out.print("\nEnter current temperature: ");
        temp = Double.valueOf(scnr.nextLine());
        System.out.print("\nEnter starting wind speed: ");
        speed = Double.valueOf(scnr.nextLine());

        if (speed < 0) {
            throw new Error("windspeed must be higher than 0");
        } else for (int i = 0; i < 15; i++) {
            double currentSpeed = speed + i;
            windchill = (currentSpeed < 4) ? temp : (0.6215 * temp) - (35.75 * Math.pow(currentSpeed, 0.16)) + (0.4275 * temp * Math.pow(currentSpeed, 0.16)) + 35.74;
            System.out.printf("Temp is %.2f Wind is %.2f Windchill = %.2f%n", temp, currentSpeed, windchill);
        }
        
    }
}