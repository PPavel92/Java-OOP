package Home_Work_1.Unit;

// # Арбалетчик
public class Crossbowman extends Shooter {
   
    public Crossbowman(int health, int damage, int defense, int speed, int distance, int posX, int posY) {
        super(health, damage, defense, speed, distance, posX, posY);
        super.name = name;
    }

    Vector2D coords = new Vector2D(1,1);

    public Crossbowman(String name){
        super(100, 8,5,  1, 8,0,0);
        super.name = name;
    }
   
    public void move() {  // Средняя скрость передвижения
        this.speed -= 5;
    }

       public String toString() {
        return "Crossbowman: " + name + "\nHealth: " + health + "\nSpeed: " + speed + "\nDamage: " + damage;
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }

    @Override
    public void step() {
    }
}