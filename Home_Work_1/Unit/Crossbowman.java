package Home_Work_1.Unit;

// # Арбалетчик
public class Crossbowman extends Character {
    public Crossbowman(String name, int health, int damage, int speed) {
        super(name, health, damage, speed);
    }
    
    int shot = 0;
    int amount =3;  
    public void attack(Character target) { //Атака с большой дистанции.
       if(amount != 0){
        target.health -= this.damage;
        amount = amount - shot;
        }
       else{
        damage= 0;
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
}