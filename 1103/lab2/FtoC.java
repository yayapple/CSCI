public class FtoC {
    public static void main(String[] args) {
        double tempF, tempC;

        tempF = Double.valueOf(args[0]);
        tempC = (5.0 / 9.0) * (tempF - 32.0);

        System.out.println(tempF + " Fahrenheit is " + tempC + " Celcius.");
    }
}