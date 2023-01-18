import java.util.Random;

public class OrientationOld {
    public static void main(String[] args) {
        Random rand = new Random();
        final int repetitions = 10000000;
        for (int start = 2; start <= 7; start++) { // for starting blocks 2 - 7
            
            boolean[] gotToOrientation = new boolean[repetitions];
            int[] stepsTaken = new int[repetitions];

            for (int i = 0; i < repetitions; i++) { // repeat simulation 500 times
                int steps = 0;
                boolean madeIt = false; // false = car, true = orientation
                int currentBlock = start;

                while (currentBlock != 1 && currentBlock != 8) { // repeat random walk until arrived
                    steps += 1;
                    if (rand.nextInt(5) < 2) { // rand int = 0, 1
                        currentBlock -= 1;
                    } else {                   // rand int = 2, 3, 4
                        currentBlock += 1;
                    }
                    if (currentBlock == 8) {
                        madeIt = true;
                    }
                }
                gotToOrientation[i] = madeIt;
                stepsTaken[i] = steps;
            }

            double arrivalRate = calcArrivalRate(gotToOrientation);
            double avgStepsTaken = calcAvgStepsTaken(stepsTaken);

            System.out.printf("After %,d trips starting on block %d%n", repetitions,  start);
            System.out.printf("the student makes it to orientation %.1f%% of the time%n", arrivalRate);
            System.out.printf("and to the car %.1f%% of the time%n", 100 - arrivalRate);
            System.out.printf("with an average of %.3f steps per trip.%n%n", avgStepsTaken);
            
        }
    }

    public static double calcArrivalRate(boolean[] b) {
        int sum = 0;

        for (boolean dest : b) {
            if (dest == true) {
                sum += 1;
            }
        }
        return (sum / (double) b.length) * 100.0;
    }

    public static double calcAvgStepsTaken(int[] i) {
        int sum = 0;

        for (int steps : i) {
            sum += steps;
        }
        return sum / (double) i.length;
    }
}
