import java.util.Scanner;

public class Hangman {
    private static final String[] WORDS = {"hangman", "computer", "java", "programming", "hello"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToGuess = selectRandomWord();
        int attempts = 6;
        char[] guessedWord = new char[wordToGuess.length()];
        boolean[] guessedLetters = new boolean[26]; 
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
        while (attempts > 0 && !isWordGuessed(guessedWord)) {
            System.out.println("Attempts left: " + attempts);
            displayWord(guessedWord);

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (guessedLetters[guess - 'a']) {
                System.out.println("You already guessed this letter. Try again.");
                continue;
            }

            guessedLetters[guess - 'a'] = true;

            if (wordToGuess.contains(String.valueOf(guess))) {
                updateGuessedWord(guess, wordToGuess, guessedWord);
                System.out.println("Correct guess!");
            } else {
                System.out.println("Incorrect guess!");
                attempts--;
            }
        }

        if (isWordGuessed(guessedWord)) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Out of attempts! The word was: " + wordToGuess);
        }
    }

    private static String selectRandomWord() {
        return WORDS[(int) (Math.random() * WORDS.length)];
    }

    private static void displayWord(char[] word) {
        for (char c : word) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void updateGuessedWord(char guess, String wordToGuess, char[] guessedWord) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord[i] = guess;
            }
        }
    }

    private static boolean isWordGuessed(char[] guessedWord) {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
