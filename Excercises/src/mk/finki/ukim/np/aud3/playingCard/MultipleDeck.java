package mk.finki.ukim.np.aud3.playingCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleDeck {
    private List<Deck> multipleDecks;

    public MultipleDeck(int num){
        this.multipleDecks = new ArrayList<>();
        for(int i=0; i<num; i++){
            multipleDecks.add(new Deck());
        }
    }

    public Deck getDeck(int index){
        return this.multipleDecks.get(index);
    }

    @Override
    public String toString() {
        return multipleDecks.stream().map(Deck::toString).collect(Collectors.joining("\n"));
    }

    public static void main(String[] args) {
        MultipleDeck multipleDeck = new MultipleDeck(2);
//        System.out.println(multipleDeck);
//        multipleDeck.getDeck(0).shuffle();
        System.out.println(multipleDeck.getDeck(1).dealCard());
        System.out.println(multipleDeck.getDeck(1).dealCard());
        System.out.println(multipleDeck.getDeck(1).dealCard());
        System.out.println(multipleDeck.getDeck(1).dealCard());


    }
}

