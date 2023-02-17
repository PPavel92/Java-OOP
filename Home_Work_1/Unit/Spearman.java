package Home_Work_1.Unit;

// # Копейщик
public class Spearman extends Character {
    public Spearman(String name, int health, int damage, int speed) {
        super(name, health, damage, speed);
    }

    public void attack(Character target) {  // Наносит большой урон.
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
}