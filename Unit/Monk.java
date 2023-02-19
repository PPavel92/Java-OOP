package Unit;

// # Монах
public class Monk extends Mage {
    public Monk(int health, int damage, int magic, int speed, int shots, int maxShots, float dist) {
        super(health, damage, magic, speed, shots, maxShots, dist);
        super.name = name;
    }

    public Monk(String name){
        super(100, 8, 7, 1, 10, 25, 4);
        super.name = name;
    }

    public void attack(Unit_Character target) {  // Ррукопашный бой
        target.health -= (this.damage / 2);
    }
     
    public void move() { // Способность перемещяться в прострвнстве
        this.speed -= 6;
    }

    public void heal(Unit_Character target) {   // Способность лечения(Союзников и самоизлечения).
        target.health += this.magic;
    }

    public void mana() {   // Расход магии.
        
    }

    public String toString() {
        return "Monk: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nSpeed: " + speed;
    }

    @Override
    public String getInfo() {
        return "Я Монах!";
    }
}
