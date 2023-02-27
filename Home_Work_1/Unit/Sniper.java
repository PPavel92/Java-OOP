package Home_Work_1.Unit;



// # Снайпер
public class Sniper extends Shooter {
    public Sniper(int health, int damage, int defense, int speed, int distance, int posX, int posY) {
        super(health, damage, defense, speed, distance, posX, posY);
        super.name = name;

    }
    Vector2D coords = new Vector2D(1,1);
    
    public Sniper(String name){
        super(100, 13, 5, 1, 10,0,0);
        super.name = name;
    }
    
    public String toString() {
        return "Sniper: " + name + "\nHealth: " + health + "\nDamage: " + damage+ "\nSpeed: " + speed + "\nCoordinates: " + coords;
    }

    @Override
    public String getInfo() {
        return "Я Снайпер!";
    }



    @Override
    public void step() {
    }



   
}