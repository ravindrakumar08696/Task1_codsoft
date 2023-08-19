import java.util.Scanner;

public class Number_game {
    public static void NumberGame() {
        try (Scanner sc = new Scanner(System.in)) {
            int number = 1 + (int) (100 * Math.random());
            int trials = 5;
            int i, guess_number;

            System.out.println("Guess any number between 1 to 100. Guess the number within 5 trials.");
            for (i = 0; i < trials; i++) {
                System.out.println("Guess the number:");
                guess_number = sc.nextInt();
                if (number == guess_number) {
                    System.out.println("Congratulations!" + " The guess is correct");
                    break;
                } else if (number > guess_number && i != trials - 1) {
                    System.out.println("The number is high than the " + guess_number);
                } else if (number < guess_number && i != trials - 1) {
                    System.out.println("The number is low than the " + guess_number);
                }
            }

            if (i == trials) {
                System.out.println("You have already use your all trials");
                System.out.println("The Computer Generated number is " + number);
            }
        }
    }

    public static void main(String arg[]) {
        NumberGame();
    }
}
