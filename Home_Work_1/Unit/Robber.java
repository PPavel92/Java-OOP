package Home_Work_1.Unit;

// # Разбойник
public class Robber extends Warrior {
    public Robber(int health, int damage,int defense, int speed) {
        super( 100, 10,5, 5);
        super.name = name;
    }

    public Robber(String name){
        super(100, 10,5, 8);
        super.name = name;
    }

    public void move() {
        this.speed += 10;
    }
    
    public String toString() {
        return "Robber: " + name + "\nHealth: " + health + "\nDamage: " + damage+ "\nSpeed: " + speed;
    }

    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }
}
