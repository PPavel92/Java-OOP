package Home_Work_1.Unit;
public abstract class Shooter extends Unit_Character{

    protected int cartridgeCount;

    int attack;
    int distance;
    String name;

    public Shooter(int health, int damage, int defense, int speed, int distance) {
        super(health, damage, defense, speed);
        this.distance = distance;
        this.cartridgeCount= 5;

}

    public float getDist(){
        return distance;
    }

    public void attack(Unit_Character enemy) {  // Сильная атака.
        attack = (int) (this.damage);
        System.out.println(this.getName() + " наносит " + enemy.getName() + damage + " урона!");
        enemy.defend(attack);
    }
    
    public void distanceAttack(Unit_Character enemy, int distance) {
        if (this.cartridgeCount == 0) {
            System.out.println(this.getName() + " Закончились потроны, нужно пополнить запас!");
            return;
        }

        if (distance <= 5) { // короткая дистанция
            attack = (int) (this.damage * 1.5);
            System.out.println(this.getName() + " выстрелил в " + enemy.getName() + " на короткой дистанции " + damage + " урона!");
        } else if (distance <= 10) { // средняя дистанция
            attack = (int) (this.damage * 1.0);
            System.out.println(this.getName() + " выстрелил в " + enemy.getName() + " на средней дистанции " + damage + " урона!");
        } else { // дальняя дистанция
            if (Math.random() < 0.5) { // 50% шанс промахнуться на дальней дистанции  
                attack = 0;
                System.out.println(this.getName() + " Выстрелил мимо! ");
            } else {
                attack = (int) (this.damage * 0.5);
                System.out.println(this.getName() + "выстрелил в " + enemy.getName() + " на короткой дистанции " + damage + " урона!");
            }
        }
        enemy.defend(attack);
        this.cartridgeCount--;
    }

    public void arsenal() {
        this.cartridgeCount++; 
    }
}