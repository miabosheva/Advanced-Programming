package mk.finki.ukim.np.aud4.alien;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AlienPack {
    private ArrayList<Alien> aliens;

    public AlienPack() {
        this.aliens = new ArrayList<Alien>();
    }

    public void addAlien(char type, int health, String name){
        switch (type){
            case 's': aliens.add(new Snake(health,name)); break;
            case 'o': aliens.add(new Ogre(health, name)); break;
            case 'm': aliens.add(new Marshmallow_Man(health, name)); break;
        }

    }

    public int calculateDamage(){
        int damage = 0;
        for(Alien alien: aliens){
            damage+=alien.getDamage();
        }
        return damage;
    }

    @Override
    public String toString() {
        return aliens.stream().map(Alien::toString).collect(Collectors.joining("\n"));
    }

    public static void main(String[] args) {
        AlienPack alienPack = new AlienPack();
        alienPack.addAlien('o',10, "johnny");
        alienPack.addAlien('s',8, "mia");
        alienPack.addAlien('m',9, "marty");
        alienPack.addAlien('s',100, "wick");
        System.out.println(alienPack);
        System.out.println(alienPack.calculateDamage());
    }
}
