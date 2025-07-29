import java.util.*;

public class numberGame {

    public static void check() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int maxAttempt = 8;
        int score = 0;
        boolean playAgain = false, guessCorrectly;
        int attempts;

        System.out.println("🎮 Welcome to the Number Guessing Game!\n");
        System.out.println("Guess the number from " + min + " to " + max);
        System.out.println("You have " + maxAttempt + " attempts.\n");
        do {
            guessCorrectly = false;
            attempts= 0;
            int randomNum = rand.nextInt(max - min + 1) + min;
            System.out.println("----------------------------Let's play!---------------------------------");

            while (attempts < maxAttempt) {
                attempts++;
                System.out.println();
                System.out.print(attempts + ".Enter a number: ");
                int num = sc.nextInt();
                if (num > randomNum) {
                    System.out.println("Number to high " + num + "\n");
                } else if (num < randomNum) {
                    System.out.println("Number is to low " + num + "\n");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    attempts = 0;
                    guessCorrectly = true;
                    break;
                }

            }
            if (!guessCorrectly) {
                System.out.println( "You've used all attempts you failled to guess the number. The number was: " + randomNum);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String res = sc.next().toLowerCase();
            playAgain = res.equals("yes");

        } while (playAgain);

        System.out.println("\nFinal Score: " + score);
        System.out.println("Thanks for playing!\n");
        sc.close();
    }

    public static void main(String[] args) {
        check();
    }
}
