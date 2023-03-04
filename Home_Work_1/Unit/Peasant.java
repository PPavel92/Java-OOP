package Home_Work_1.Unit;

import java.util.ArrayList;

// # Крестьянин.
public class Peasant extends Unit_Character {

    protected int cartridgeCount;
    public Peasant(String name, int health, int damage, int defense, int speed, int cartridgeCount, int posX, int posY) {
        super(name, health, damage, defense, speed, posX,  posY);
        this.cartridgeCount = cartridgeCount;
    }
   
    public Peasant(String name, Vector2D coords) {
        super(name, 50, 1, 1, 3, coords.posX, coords.posY);
        this.cartridgeCount = 1;
    }

    // public void supplier(Shooter shooter) { // Поставляет арсенал стрелкам.
    //     if (shooter.cartridgeCount == 5) {
    //         return;
    //     }
    //     shooter.arsenal();
    // }

    @Override
    public  void step(ArrayList<Unit_Character> Mine, ArrayList<Unit_Character> Enemy) {
        if (health <= 0) {return;}

        state = "Stand";
        for (Unit_Character character : Mine) {
            if (character.getHealth() < character.getMaxHealth()|| character.getHealth() >0) {
                character.setHealth(character.getHealth() + 1);
                System.out.println("Крестьянен " + getName() + " вылечил " + character.getName()+ " +1 очко здоровья!");
                break; 
            }
        }
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Крестьянин ").append(getName());
    }
}