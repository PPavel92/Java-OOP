package Home_Work_1.Unit;



// # Снайпер
public class Sniper extends Shooter {
    public Sniper(int health, int damage, int defense, int speed, int shots, int maxShots, float dist) {
        super(health, damage, defense, speed, shots, maxShots, dist);
        super.name = name;
    }

    public Sniper(String name){
        super(100, 13, 5, 1, 10, 23, 10);
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