package Home_Work_1.Unit;

import java.util.ArrayList;

public abstract class Mage extends Unit_Character{

    int shots, maxShots;
    float dist;
    String name;

    public Mage(String name,int health, int magic, int defense, int speed, int posX, int posY) {
        super(name, health, magic, defense, speed, posX, posY);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    

    @Override
    public  void step(ArrayList<Unit_Character> Mine, ArrayList<Unit_Character> Enemy) {
        if (health <= 0) {return;}

        for (Unit_Character character : Mine) {
            if (character.getHealth() < character.getMaxHealth() || character.getHealth() > 0) {
                character.setHealth(character.getHealth() + magic);
                System.out.println(getName() + " вылечил магией " + character.getName() +" + "+ magic + " очков здоровья!");
                break; 
            }
        }
    }

    public float getDist(){
        return dist;
    }

    @Override
    public String toString() {
        return getInfo() +
                " H:" + Math.round(health) +
                " D:" + defense +
                " A:" + magic + 
               " " + state;
    }
}