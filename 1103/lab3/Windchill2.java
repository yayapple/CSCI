public class Windchill2 {
    public static void main(String[] args) {
        double windchill, temp, speed;
        temp = Double.valueOf(args[0]);
        speed = Double.valueOf(args[1]);
        if (speed < 0) {
          throw new Error("windspeed must be higher than 0");
        } else if (speed < 4) {
          windchill = temp;
        } else {
          windchill = (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, 0.16)) + 35.74;
        }

        System.out.printf(temp + " Degrees Fahrenheit with a windspeed of " + speed + " feels like %.2f degrees", windchill);
    }
}