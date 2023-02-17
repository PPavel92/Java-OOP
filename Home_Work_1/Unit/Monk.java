package Home_Work_1.Unit;

// # Монах
public class Monk extends Character {
    public Monk(String name, int health, int damage, int speed) {
        super(name, health, damage, speed);
    }

    public void attack(Character target) {  // Ррукопашный бой
        target.health -= (this.damage / 2);
    }
     
    public void move() { // Способность перемещяться в прострвнстве
        this.speed += 15;
    }

    public void heal(Character target) {   // Способность лечения(Союзников и самоизлечения).
        target.health += this.magic;
    }

    public void mana() {   // Расход магии.
        
    }

    public String toString() {
        return "Monk: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nSpeed: " + speed;
    }
}
