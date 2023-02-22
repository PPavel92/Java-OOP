package Home_Work_1.Unit;



// # Колдун
public class Sorcerer extends Mage {
    public Sorcerer(int health, int damage, int defense, int magic, int speed, int shots, int maxShots, float dist) {
        super(health, damage, defense, magic, speed, shots, maxShots, dist);
        super.name = name;
    }

    public Sorcerer(String name){
        super(100, 8,5, 7, 3, 10, 25, 4);
        super.name = name;
    }

    public void attack(Unit_Character target) {  // Наносит сильный  магический урон
        target.health -= (3 * this.damage);
    }
         
    public void move() { // Способность перемещяться в прострвнстве
        this.speed -= 5;
    }

    public void heal(Unit_Character target) {   // Способность лечения(Союзников и самоизлечения).
        target.health += this.magic;
    }

    public void mana() {   // Расход магии.
        
    }

    public String toString() {
        return "Sorcerer: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nSpeed: " + speed + "\nMagic: " + magic;
    }

    @Override
    public String getInfo() {
        return "Я Колдун";
    }
}