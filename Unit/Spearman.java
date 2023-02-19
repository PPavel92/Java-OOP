package Unit;

// # Копейщик
public class Spearman extends Warrior {
    public Spearman(int health, int damage, int speed) {
        super(health, damage, speed);
        super.name = name;
    }

    public Spearman(String name){
        super(100, 8, 5);
        super.name = name;
    }

    public void attack(Unit_Character target) {  // Наносит большой урон.
        target.health -= (this.damage * 3);
    }

    public void evasions() {  //  Может уклониться от атаки.
        
    }

    public void move() {
        this.speed += 10;
    }

    public String toString() {
        return "Spearman: " + name + "\nHealth: " + health + "\nSpeed: " + speed + "\nDamage: " + damage;
    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }
}