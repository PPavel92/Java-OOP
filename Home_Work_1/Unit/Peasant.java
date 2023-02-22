package Home_Work_1.Unit;

// # Крестьянин.
public class Peasant extends Unit_Character {

    public Peasant(int health, int damage, int defense, int speed) {
        super( health, damage, defense, speed);
        super.name = name;
    }

    public Peasant(String name){
        super(100, 8,5, 5);
        super.name = name;
    }
    public void attack(Unit_Character target) {    // Рукопашный бой
        target.health -= (this.damage / 2);
    }
    
    public void move() {  
        this.speed += 8;
    }

    public void supplier(Shooter shooter) {  // Поставляет арсенал стрелкам.
            if (shooter.cartridgeCount == 5) {
                return;
            }
            shooter.arsenal();
        }

    public void heal(Unit_Character target) {  // Оказывает первую помощь (востанавливает в половину меньше здоровья чем колдун и монах).
        target.health += (this.magic / 2);
    }

    public String toString() {
    return "Peasant: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nSpeed: " + speed;
}
}