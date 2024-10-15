import java.util.*;

public class DeckOfCards {

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
        String[] ranks = {
            "Ace",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "Jack",
            "Queen",
            "King",
        };

        // Initialize the cards
        for (int i = 0; i < deck.length; i++) deck[i] = i;

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        //Thread 1
        Thread t1 = new Thread(
            new Runnable() {
                public void run() {
                    for (int i = 0; i < 4; i++) {
                        String suit = suits[deck[i] / 13];
                        System.out.println(
                            "Suits: " +
                            suit +
                            ", " +
                            Thread.currentThread().getId()
                        );
                    }
                }
            }
        );
        t1.start();
        //Thread 2
        Thread t2 = new Thread(
            new Runnable() {
                public void run() {
                    for (int i = 0; i < 4; i++) {
                        String rank = ranks[deck[i] % 13];
                        System.out.println(
                            "Card number " +
                            deck[i] +
                            ": " +
                            rank +
                            " of " +
                            suits[deck[i] / 13] +
                            "- Thread id: " +
                            Thread.currentThread().getId()
                        );
                    }
                }
            }
        );
        t2.start();
    }
}
