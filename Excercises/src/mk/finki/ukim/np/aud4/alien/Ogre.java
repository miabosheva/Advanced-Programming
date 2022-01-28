package mk.finki.ukim.np.aud4.alien;

public class Ogre extends Alien{
    public Ogre(int health, String name) {
        super(health, name);
    }

    @Override
    public int getDamage() {
        return 6;
    }
    @Override
    public String toString() {
        return "Ogre: " + this.getName() + "\nHealth: "+this.getHealth()+"\n";
    }
}
