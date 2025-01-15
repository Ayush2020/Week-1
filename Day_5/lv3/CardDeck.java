import java.util.Arrays;
import java.util.Random;

public class CardDeck {

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();

        // Shuffle the deck by swapping each card with a random card
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i); 
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute the deck of cards to x players
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer) {
        int totalCards = numOfPlayers * cardsPerPlayer;

        if (totalCards > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[numOfPlayers][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Specify the number of players and cards per player
        int numOfPlayers = 4; 
        int cardsPerPlayer = 5; 

        // Distribute the cards to players
        String[][] players = distributeCards(deck, numOfPlayers, cardsPerPlayer);

        
        if (players != null) {
            printPlayersCards(players);
        }
    }
}
