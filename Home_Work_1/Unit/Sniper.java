package Home_Work_1.Unit;



// # Снайпер
public class Sniper extends Shooter {
    public Sniper(int health, int damage, int defense, int speed, int distance) {
        super(health, damage, defense, speed, distance);
        super.name = name;
    }

    public Sniper(String name){
        super(100, 13, 5, 1, 10);
        super.name = name;
    }
    
    
          
    public void move() { // Двигается медленно, чтобы сохранять точность.
        this.speed -= 10;
    }

    public void extraShot() {  // Может помечать цель для дополнительного урона. "Реализовать через бул"
        
    }
    
    public String toString() {
        return "Sniper: " + name + "\nHealth: " + health + "\nDamage: " + damage+ "\nSpeed: " + speed;
    }

    @Override
    public String getInfo() {
        return "Я Снайпер!";
    }
}