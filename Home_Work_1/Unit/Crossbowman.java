package Home_Work_1.Unit;

// # Арбалетчик
public class Crossbowman extends Shooter {
   
    public Crossbowman(int health, int damage, int defense, int speed, int distance) {
        super(health, damage, defense, speed, distance);
        super.name = name;
    }

    public Crossbowman(String name){
        super(100, 8,5,  1, 8);
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
}