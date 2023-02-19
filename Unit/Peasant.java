package Unit;

// # Крестьянин.
public class Peasant extends Unit_Character {

    public Peasant(int health, int damage, int speed) {
        super( health, damage, speed);
        super.name = name;
    }

    public Peasant(String name){
        super(100, 8, 5);
        super.name = name;
    }
    public void attack(Unit_Character target) {    // Рукопашный бой
        target.health -= (this.damage / 2);
    }
    
    public void move() {  
        this.speed += 8;
    }

    public void supplier() {  // Поставляет арсенал стрелкам.
        
    }

    public void heal(Unit_Character target) {  // Оказывает первую помощь (востанавливает в половину меньше здоровья чем колдун и монах).
        target.health += (this.magic / 2);
    }

    public String toString() {
    return "Peasant: " + name + "\nHealth: " + health + "\nSpeed: " + magic + "\nDamage: " + damage;
}
}