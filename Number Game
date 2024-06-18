import java.util.Random;
import java.util.Scanner;

class RandomNumber {
    private static final int LOW = 1;
    private static final int UPPER = 100;

    public static void main(String[] args) {
        int score = 0;
        int roundsWon = 0;
        int totalRounds = 0;

        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int numToGuess = generateRandomNumber();
            int attemptsAllowed = calculateAttemptsAllowed();
            System.out.println("You have " + attemptsAllowed + " chances to guess the number");
            boolean guessedCorrectly = false;

            int attempts = 0;
            while (attempts < attemptsAllowed) {
                int guess = getUserGuess(sc);
                attempts++;
                guessedCorrectly = checkGuess(numToGuess, guess, attempts, attemptsAllowed);
                if (guessedCorrectly) {
                    roundsWon++;
                    score += attemptsAllowed - attempts + 1;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("The number was " + numToGuess);
                System.out.println("You are out of guesses, Better luck next time");
            }

            totalRounds++;
            playAgain = askToPlayAgain(sc);
        }

        displayResults(totalRounds, roundsWon, score);
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt((UPPER - LOW + 1) + LOW);
    }

    private static int calculateAttemptsAllowed() {
        return (int) (Math.log(UPPER - LOW + 1) / Math.log(2));
    }

    private static int getUserGuess(Scanner sc) {
        System.out.println("Guess the number: ");
        return sc.nextInt();
    }

    private static boolean checkGuess(int numToGuess, int guess, int attempts, int attemptsAllowed) {
        if (numToGuess == guess) {
            System.out.println("You have guessed the right number");
            return true;
        } else if (guess > numToGuess) {
            System.out.println("The guessed number is too high");
        } else {
            System.out.println("The guessed number is too low");
        }

        return false;
    }

    private static boolean askToPlayAgain(Scanner sc) {
        System.out.println("Would you like to play again? (y/n)");
        String playAgainInput = sc.next();
        return playAgainInput.equalsIgnoreCase("y");
    }

    private static void displayResults(int totalRounds, int roundsWon, int score) {
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Your score: " + score);
    }
}
