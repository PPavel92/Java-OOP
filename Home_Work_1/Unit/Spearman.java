package Home_Work_1.Unit;


// # Копейщик
public class Spearman extends Warrior {
    public Spearman(int health, int damage, int defense, int speed) {
        super(health, damage, defense, speed);
        super.name = name;
    }

    public Spearman(String name) {
        super(100, 8, 5, 5);
        super.name = name;
    }
    
    public void move() {
        this.speed += 10;
    }

    public String toString() {
        return "Spearman: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nSpeed: " + speed;
    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }
}