package mk.finki.ukim.np.aud4.alien;

public abstract class Alien {
    private int health;
    private String name;

    public Alien(int health, String name) {
        if (health < 10 && health > 0) {
            this.health = health;
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = 10;
        }

        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getDamage();
}
