public class CtoF {
    public static void main(String[] args) {
        double tempC;
        double tempF;

        tempC = Double.valueOf(args[0]);
        tempF = (9.0 / 5.0) * tempC + 32.0;

        System.out.println(tempC + " Celcius is " + tempF + " Fahrenheit");
    }
}