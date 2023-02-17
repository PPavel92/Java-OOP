package Home_Work_1.Unit;

// # Разбойник
public class Robber extends Character {
    public Robber(String name, int health, int damage, int speed) {
        super(name, health, damage, speed);
    }

    public void attack(Character target) {  //  Сильная атака. 
        target.health -= (this.damage * 2);
    }

    public void evasions() {  //  Может уклониться от атаки.
        
    }

    public void move() {
        this.speed += 10;
    }
    
    public String toString() {
        return "Robber: " + name + "\nHealth: " + health + "\nSpeed: " + speed + "\nDamage: " + damage;
    }
}
