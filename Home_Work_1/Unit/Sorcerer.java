package Home_Work_1.Unit;

// # Колдун
public class Sorcerer extends Character {
    public Sorcerer(String name, int health, int damage, int magic) {
        super(name, health, damage, magic);
    }

    public void attack(Character target) {  // Наносит сильный  магический урон
        target.health -= (3 * this.damage);
    }
         
    public void move() { // Способность перемещяться в прострвнстве
        this.speed -= 5;
    }

    public void heal(Character target) {   // Способность лечения(Союзников и самоизлечения).
        target.health += this.magic;
    }

    public void mana() {   // Расход магии.
        
    }

    public String toString() {
        return "Sorcerer: " + name + "\nHealth: " + health + "\nSpeed: " + magic;
    }
}