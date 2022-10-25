import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Enter # of rows: ");
        int rows = scnr.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}