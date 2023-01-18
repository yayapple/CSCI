import java.util.Random;
public class CoinFlip {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int headsCount = 0, tailsCount = 0;
        for (int i = 0; i < 10000; i++) {
            int flip = rand.nextInt(2);

            if (flip == 1) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        System.out.printf("Number of heads: %d%nNumber of tails: %d%n%n", headsCount, tailsCount);
        System.out.printf("Chance of getting heads: %.1f%% %nChance of getting tails: %.1f%% %n", headsCount / 10000.0 * 100.0, tailsCount / 10000.0 * 100.0);

    }
}