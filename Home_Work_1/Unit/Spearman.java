package Home_Work_1.Unit;


// # Копейщик
public class Spearman extends Warrior {
    public Spearman(int health, int damage, int defense, int speed) {
        super(health, damage, defense, speed);
        super.name = name;
    }

    public Spearman(String name) {
        super(100, 8, 5, 5);
        super.name = name;
    }
    
    double precision;

    public void attack(Unit_Character enemy) { // Наносит большой урон.
        attack = (int) (this.damage * this.precision);
        System.out.println(this.getName() + " наносит " + enemy.getName() + " удар копьем " + damage + " урона!");
        enemy.defend(attack);
    }

    public void attackPrecision(double precision) { // Наносит более точный удар.
        
        if (Math.random() == 3) {
            precision = 1.2;   
        }
    }
    

    public void evasions() { // Может уклониться от атаки.

    }

    public void move() {
        this.speed += 10;
    }

    public String toString() {
        return "Spearman: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nSpeed: " + speed;
    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }
}