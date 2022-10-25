import java.util.*;

public class rps {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Select rock, paper, or scissors: \n> ");

        String userChoice = scnr.nextLine().toLowerCase();

        String[] choices = {"rock", "paper", "scissors"}; // define valid choices 
        boolean valid = Arrays.asList(choices).contains(userChoice); //check if the user input is in acceptable list
        if (!valid) { // if not valid then boot them out
            System.out.println("thats not rock paper or scissor!!");
            System.exit(0);
        } 

        String computerChoice = getRandom(choices); // have the computer choose one
        System.out.println("\nYou selected: " + userChoice);
        System.out.println("The computer selected: " + computerChoice + "\n");

        checkWinner(userChoice, computerChoice);
    }

    public static String getRandom(String[] array) {
        int rand = new Random(System.currentTimeMillis()).nextInt(array.length); // time call sets random seed
        return array[rand];
    }

    public static void checkWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) { // first check if the choices are equal, indicating a tie
            System.out.println("you tied!!");
            System.exit(0);
        } 
        boolean won = false;
        switch (userChoice) { // if not tie, go to user choice and check if won
            case "rock":
                if (computerChoice.equals("scissors")) { // there is probably a better way to do this
                    won = true;
                } 
                break;
            case "paper":
                if (computerChoice.equals("rock")) {
                    won = true;
                }
                break;
            case "scissors":
                if (computerChoice.equals("paper")) {
                    won = true;
                }
                break;
            }
        if (won == true) {
            System.out.println("you won!!");
            System.exit(0);
        } else {
            System.out.println("you lost!!");
            System.exit(0);
        }
    }
}
