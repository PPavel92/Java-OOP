package Home_Work_1.Unit;



// # Колдун
public class Sorcerer extends Mage {
    public Sorcerer(String name, Vector2D coords) {
        super(name,50, 1, 3, 7, coords.posX, coords.posY);      
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун ").append(getName());
    }
}



// public void attack(Unit_Character target) {  // Наносит сильный  магический урон
//     target.health -= (3 * this.damage);
// }
     
// public void move() { // Способность перемещяться в прострвнстве
//     this.speed -= 5;
// }

// public void heal(Unit_Character target) {   // Способность лечения(Союзников и самоизлечения).
//     target.health += this.magic;
// }

// public void mana() {   // Расход магии.
    
// }