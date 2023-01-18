import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int intValue = scnr.nextInt();
        scnr.close();
        int currValue = intValue;
        String romanValue = "";
        if (intValue < 1 || intValue > 3999) {
            System.out.println(intValue + " is outside of the expected range");
            System.exit(1);
        }
        while (currValue > 0) {
            if (currValue >= 1000) {
                romanValue += "M";
                currValue -= 1000;
            } else if (currValue >= 900) {
                romanValue += "CM";
                currValue -= 900;
            } else if (currValue >= 500) {
                romanValue += "D";
                currValue -= 500;
            } else if (currValue >= 400) {
                romanValue += "CD";
                currValue -= 400;
            } else if (currValue >= 100) {
                romanValue += "C";
                currValue -= 100;
            } else if (currValue >= 90) {
                romanValue += "XC";
                currValue -= 90;
            } else if (currValue >= 50) {
                romanValue += "L";
                currValue -= 50;
            } else if (currValue >= 40) {
                romanValue += "XL";
                currValue -= 40;
            } else if (currValue >= 10) {
                romanValue += "X";
                currValue -= 10;
            } else if (currValue == 9) {
                romanValue += "IX";
                currValue = 0;
            } else if (currValue >= 5) {
                romanValue += "V";
                currValue -= 5;
            } else if (currValue == 4) {
                romanValue += "IV";
                currValue = 0;
            } else {
                romanValue += "I";
                currValue -= 1;
            }
        }

        System.out.println(intValue + " in Roman Numerals is " + romanValue);
    }
}
