package mk.finki.ukim.np.aud4.alien;

public class Marshmallow_Man extends Alien{
    public Marshmallow_Man(int health, String name) {
        super(health, name);
    }

    @Override
    public int getDamage() {
        return 1;
    }
    @Override
    public String toString() {
        return "Marshmallow Man: " + this.getName() + "\nHealth: "+this.getHealth()+"\n";
    }
}
