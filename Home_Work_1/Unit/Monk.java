package Home_Work_1.Unit;

// # Монах
public class Monk extends Mage {
    public Monk(int health, int damage, int defense, int magic, int speed, int shots, int maxShots, float dist, int posX, int posY) {
        super(health, damage, defense, magic, speed, shots, maxShots, dist, posX, posY);
        super.name = name;
    }

    public Monk(String name){
        super(100, 8,5, 7, 1, 10, 25, 4,0,0);
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
        return "Monk: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nSpeed: " + speed + "\nMagic: " + magic;
    }

    @Override
    public String getInfo() {
        return "Я Монах!";
    }

    @Override
    public void step() {
    }
}
