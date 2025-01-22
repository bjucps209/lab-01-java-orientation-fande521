
import java.util.*;

public class Guess {
    public static void main(String[] args) {
        Random randObj = new Random();
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int secretNum = randObj.nextInt(1,11);          // generate secretNum
        int numGuesses = 0;
        while (secretNum != guess) {
            System.out.print("Enter your guess: ");
            guess = Integer.parseInt(scan.nextLine());
            numGuesses += 1;

            // Give feedback on guess
            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum){
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("You got it!!");
            }
        }
        System.out.println("It took you " + numGuesses + " guesses.");
    }
    
}
