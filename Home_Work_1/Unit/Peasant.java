package Home_Work_1.Unit;

// # Крестьянин.
public class Peasant extends Unit_Character {

    public Peasant(int health, int damage, int defense, int speed, int posX, int posY) {
        super(health, damage, defense, speed, posX,  posY);
        super.name = name;
    }

    public Peasant(String name) {
        super(100, 8, 5, 5,0,0);
        super.name = name;
    }

    public void supplier(Shooter shooter) { // Поставляет арсенал стрелкам.
        if (shooter.cartridgeCount == 5) {
            return;
        }
        shooter.arsenal();
    }

    public String toString() {
        return "Peasant: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nSpeed: " + speed + "\nCoordinates: " + coords;
    }


    @Override
    public void step() {
    }
}

// public void attack(Unit_Character target) { // Рукопашный бой
    //     target.health -= (this.damage / 2);
    // }

// public void heal(Unit_Character target) { // Оказывает первую помощь (востанавливает в половину меньше здоровья чем колдун и монах).
                                               
    //     target.health += (this.magic / 2);
    // }