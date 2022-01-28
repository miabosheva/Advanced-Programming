package mk.finki.ukim.np.aud3.playingCard;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<PlayingCard> deck;
    private boolean[] picked;
    private int total;

    public Deck() {
        total = 0;
        this.picked = new boolean[52];
        this.deck = new ArrayList<>();

        for (int i = 0; i < PlayingCard.TYPE.values().length; i++) {
            for (int j = 1; j <= 13; j++) {
                deck.add(new PlayingCard(PlayingCard.TYPE.values()[i], j));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (PlayingCard i : deck) {
            stringBuilder.append(i);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void shuffle() {
        boolean[] pickedLocal = new boolean[52];

        ArrayList<PlayingCard> temp = new ArrayList<>();

        int counter = 0;

        while (counter < 52) {
            int index = (int)(Math.random() * (52));
            if (!pickedLocal[index]) {
                temp.add(deck.get(index));
                pickedLocal[index] = true;
                counter++;
            }
        }
        this.deck = temp;
    }

    public PlayingCard dealCard() {
        if(total==52){
            return null;
        }
        while(true){
            int num = (int)(Math.random() * 52);
            if(!this.picked[num]){
                this.picked[num] = true;
                total++;
                return this.deck.remove(num);
            }
        }
    }

    public boolean checkCards() {
        return false;
    }
}
