package mk.finki.ukim.np.aud4.alien;

public class Snake extends Alien {
    public Snake(int health, String name) {
        super(health, name);
    }

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public String toString() {
        return "Snake: " + this.getName() + "\nHealth: "+this.getHealth()+"\n";
    }
}
