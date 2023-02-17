package Home_Work_1.Unit;

// # Снайпер
public class Sniper extends Character {
    public Sniper(String name, int health, int damage, int speed) {
        super(name, health, damage, speed);
    }

    public void attack(Character target) {  // Сильная атака.
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
}