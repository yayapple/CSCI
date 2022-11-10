/*
 * Ethan Peterson
 * pet03320@umn.edu
 * 5623265
 */

import java.util.Scanner;

public class Roman2 {
    public static void main(String[] args) {
        int userNum = 0;

        // not sure if "Make your program take input from the user directly" means using the scanner class or using arguments.
        if (args.length == 0) {                     
            Scanner scnr = new Scanner(System.in);
            userNum = scnr.nextInt();
            scnr.close();
        } else {
            userNum = Integer.valueOf(args[0]);
        }

        if (userNum > 999 || userNum < 1) { // check if valid
            System.out.println("Invalid input.");
            System.exit(0);
        }

        String ret = new String();

        while (userNum > 0) {
            if (userNum >= 900 && userNum <= 999) {
                ret += "CM";
                userNum -= 900;
            } else if (userNum >= 500) {
                ret += "D";
                userNum -= 500;
            } else if (userNum >= 400) {
                ret += "CD";
                userNum -= 400;
            } else if (userNum >= 100) {
                ret += "C";
                userNum -= 100;
            } else if (userNum >= 90) {
                ret += "XC";
                userNum -= 90;
            } else if (userNum >= 50) {
                ret += "L";
                userNum -= 50;
            } else if (userNum >= 40) {
                ret += "XL";
                userNum -= 40;
            } else if (userNum >= 10) {
                ret += "X";
                userNum -= 10;
            } else if (userNum == 9) { // final
                ret += "IX";
                break;
            } else if (userNum >= 5) {
                ret += "V";
                userNum -= 5;
            } else if (userNum == 4) { // final
                ret += "IV";
                break;
            } else {
                ret += "I";
                userNum -= 1;
            }
        }
        System.out.printf("Roman numeral equivalent: %s%n", ret);
    }
}