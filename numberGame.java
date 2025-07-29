import java.util.*;

public class numberGame {

    public static void check() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int attempts = 0;

        int randomNum = rand.nextInt(max - min + 1) + min;
        // int randomNum = rand.nextInt(101); also correct

        System.out.println("Guess the number from " +min+ " to " +max);

        while (true) {
            attempts++;
            System.out.print(attempts +".Enter a number: ");
            int num = sc.nextInt();
            if (num > randomNum) {
                System.out.println("Number to high " + num);
            } else if (num < randomNum) {
                System.out.println("Number is to low " + num);
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                return;
            }
        }
    }

    public static void main(String[] args) {
        check();
    }
}
