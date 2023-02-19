package Unit;

// # Арбалетчик
public class Crossbowman extends Shooter {
    public Crossbowman(int health, int damage, int speed, int shots, int maxShots, float dist) {
        super(health, damage, speed, shots, maxShots, dist);
        super.name = name;
    }

    public Crossbowman(String name){
        super(100, 8,  1, 10, 30, 8);
        super.name = name;
    }
    
    int shot = 0;
    int amount =3;  
    public void attack(Unit_Character target) { //Атака с большой дистанции.
       if(amount != 0){
        target.health -= this.damage;
        this.amount = this.amount - this.shot;
        }
       else{
        this.damage= 0;
       } 
    }
        
    public void arsenal() {  // Колличество арсенала. "Нужно переделать."
       
    }

    public void move() {  // Средняя скрость передвижения
        this.speed -= 5;
    }

       public String toString() {
        return "Crossbowman: " + name + "\nHealth: " + health + "\nSpeed: " + speed + "\nDamage: " + damage;
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }
}