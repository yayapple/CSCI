/*
 * Ethan Peterson
 * pet03320@umn.edu
 * 5623265
 */

import java.util.Random;

public class Orientation {
    public static void main(String[] args) {
        Random rand = new Random(Integer.valueOf(args[0]));
        final int repetitions = 500;               // change how many times to repeat simulation

        for (int start = 2; start <= 7; start++) { // for starting blocks 2 - 7
            int gotToOrientation = 0, stepsTaken = 0;

            for (int i = 0; i < repetitions; i++) {
                int currentBlock = start;

                while (currentBlock != 1 && currentBlock != 8) { // repeat random walk until arrived
                    stepsTaken++;
                    if (rand.nextInt(5) < 2) { // rand int = 0, 1,
                        currentBlock--;        // move toward car
                    } else {                   // rand int = 2, 3, 4
                        currentBlock++;        // move toward orientation
                    }                          
                }
                if (currentBlock == 8) gotToOrientation++;
            }

            double arrivalRate = (gotToOrientation / (double) repetitions) * 100; // convert to percent
            double avgStepsTaken = stepsTaken / (double) repetitions;

            System.out.printf("After %,d trips starting on block %d,%n", repetitions, start);
            System.out.printf("the student makes it to orientation %.1f%% of the time,%n", arrivalRate);
            System.out.printf("with an average of %.3f steps per trip.%n%n", avgStepsTaken);

            System.out.printf("After %,d trips starting on block %d,%n", repetitions, start);
            System.out.printf("the student makes it to the car %.1f%% of the time,%n", 100 - arrivalRate);
            System.out.printf("with an average of %.3f steps per trip.%n%n", avgStepsTaken);
        }
    }
}