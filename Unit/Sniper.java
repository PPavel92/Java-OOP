package Unit;

// # Снайпер
public class Sniper extends Shooter {
    public Sniper(int health, int damage, int speed, int shots, int maxShots, float dist) {
        super(health, damage, speed, shots, maxShots, dist);
        super.name = name;
    }

    public Sniper(String name){
        super(100, 13,  1, 10, 235, 10);
        super.name = name;
    }

    public void attack(Unit_Character target) {  // Сильная атака.
        target.health -= (2 * this.damage);
    }
    
    public void move() { // Двигается медленно, чтобы сохранять точность.
        this.speed -= 10;
    }

    public void extraShot() {  // Может помечать цель для дополнительного урона. "Реализовать через бул"
        
    }

    public void arsenal() {  // Колличество арсенала.
       
    }

    public String toString() {
        return "Sniper: " + name + "\nHealth: " + health + "\nSpeed: " + speed + "\nDamage: " + damage;
    }

    @Override
    public String getInfo() {
        return "Я Снайпер!";
    }
}