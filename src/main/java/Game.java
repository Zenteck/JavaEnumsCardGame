import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private boolean isRunning;
    private int numPlayers;

    public Game(){

        UI.welcome();
        this.numPlayers = UI.getNumPlayers();
        this.players = new ArrayList<>();

        //Creating players
        for(int i = 0; i < numPlayers; i++){
            players.add(new Player(UI.getPlayerName()));
        }

        deck = new Deck();
        deck.shuffleDeck();
        this.isRunning = true;
    }



    public void dealCards(){

        for(int i = 0; i < players.size(); i++){
            UI.dealCard();
            Card dealtCard = this.deck.dealCard();
            this.players.get(i).addCard(dealtCard);
            UI.printCard(dealtCard, this.players.get(i).getName());
        }
    }

    public int calculateHighestHand(){

        int highestHand = 0;

        for (Player player: this.players){
            if(player.getHandTotal() > highestHand){
                highestHand = player.getHandTotal();
            }
        }
        return highestHand;
    }



    public void findWinners(){

        ArrayList<Player> winningPlayers = new ArrayList<Player>();

        int winningHand = calculateHighestHand();

        for (Player player: this.players){
            if(player)
        }

    }


    public void run(){

        while(this.isRunning){

            dealCards();


        }
    }
}
