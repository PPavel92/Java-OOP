package Home_Work_1.Unit;

// # Крестьянин.
public class Peasant extends Character {
    public Peasant(String name, int health, int damage, int magic) {
        super(name, health, damage, magic);
    }

    public void attack(Character target) {    // Рукопашный бой
        target.health -= (this.damage / 2);
    }
    
    public void move() {  
        this.speed += 8;
    }

    public void supplier() {  // Поставляет арсенал стрелкам.
        
    }

    public void heal(Character target) {  // Оказывает первую помощь (востанавливает в половину меньше здоровья чем колдун и монах).
        target.health += (this.magic / 2);
    }

    public String toString() {
    return "Peasant: " + name + "\nHealth: " + health + "\nSpeed: " + magic + "\nDamage: " + damage;
}
}