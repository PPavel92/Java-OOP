package Home_Work_1.Unit;


// # Копейщик
public class Spearman extends Warrior {
    public Spearman(int health, int damage, int defense, int speed, int posX, int posY) {
        super(health, damage, defense, speed,  posX, posY);
        super.name = name;
    }

    public Spearman(String name) {
        super(100, 8, 5, 5,0, 0);
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

    @Override
    public void step() {
    }
}