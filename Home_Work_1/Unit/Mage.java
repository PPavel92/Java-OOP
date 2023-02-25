package Home_Work_1.Unit;

import java.util.ArrayList;

public abstract class Mage extends Unit_Character{

    int shots, maxShots;
    float dist;
    String name;

    public Mage(int health, int damage, int defense, int magic, int speed, int shots, int maxShots, float dist, int posX, int posY) {
        super(health, damage, defense, speed, posX, posY);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    @Override
    public void step(ArrayList<Unit_Character> alliance, ArrayList<Unit_Character> soviet) {
        int index = super.findNearest(soviet); 
    }

    public float getDist(){
        return dist;
    }
}