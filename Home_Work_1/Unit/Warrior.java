package Home_Work_1.Unit;

public abstract class Warrior extends Unit_Character{

    String name;
    int attack;
    
    public Warrior(int health, int damage, int defense, int speed) {
        super(health, damage, defense, speed);
    }


    public void attackMax(Unit_Character enemy) {
        int attack = (int) (damage * 1.5);
        System.out.println(getName() + " нанес " + enemy.getName() + " урон максимальный повреждением " + damage + "!");
        enemy.defend(attack);
    }

    public void attackMin(Unit_Character enemy) {
        attack = (int) (damage * 0.5);
        System.out
                .println(getName() + " нанес " + enemy.getName() + " урон с минимальным повреждением " + damage + "!");
        enemy.defend(attack);
    }
 }

