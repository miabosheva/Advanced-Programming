package mk.finki.ukim.np.aud3.playingCard;


public class PlayingCard {
    public enum TYPE{
        HEARTS,
        CLUBS,
        DIAMONDS,
        SPADES
    }

    private TYPE type;
    private int rank;

    public PlayingCard(TYPE type, int rank){
        this.rank = rank;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%d %s", rank, type.toString());
    }
}
