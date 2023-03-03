package Home_Work_1.Unit;

import java.util.ArrayList;

public abstract class Warrior extends Unit_Character{

    String name;
    int attack;
    double precision;

    public Warrior(String name, int health, int damage, int defense, int speed, int posX, int posY) {
        super(name, health, damage, defense, speed, posX, posY);
    }

    @Override
    public  void step(ArrayList<Unit_Character> alliance, ArrayList<Unit_Character> soviet) {
        if (health <= 0) {return;}

        int index = super.findNearest(soviet);
        Unit_Character enemy = soviet.get(index);
        
        if (index < 2) {
            int damage = this.damage;        
            enemy.defend(damage);
            System.out.println(this.getName() + " наносит " + enemy.getName() + " удар копьем " + damage + " урона!");
            return;
        }
        runToTheToEnemy(index, soviet);
    }

    void runToTheToEnemy(int index, ArrayList<Unit_Character> soviet){
        if (coords.movementUP(soviet.get(index).coords) & (coords.posY != soviet.get(index).coords.posY)){
            coords.posY++;
            return;
        } else if (!coords.movementUP(soviet.get(index).coords) & (coords.posY != soviet.get(index).coords.posY)) {
            coords.posY--;
            return;
        }
        if (coords.movementLeft(soviet.get(index).coords)) {
            coords.posX++;
            return;
        } else if (!coords.movementLeft(soviet.get(index).coords)){
            coords.posX--;
            return;
        }
    }
    
    @Override
    public String toString() {
        return getInfo() +
                " H:" + Math.round(health) +
                " D:" + defense +
                " A:" + damage + 
                " " + state;
    }
 }
 

 

    // public void attack(Unit_Character_Character enemy) { // Наносит большой урон.
    //     attack = (int) (this.damage * this.precision);
    //     System.out.println(this.getName() + " наносит " + enemy.getName() + " удар копьем " + damage + " урона!");
    //     enemy.defend(attack);
    // }

    // public void attackPrecision(double precision) { // Наносит более точный удар.
        
    //     if (Math.random() == 3) {
    //         precision = 1.2;   
    //     }
    // }

    // public void attackMax(Unit_Character_Character enemy) {
    //     int attack = (int) (damage * 1.5);
    //     System.out.println(getName() + " нанес " + enemy.getName() + " урон максимальный повреждением " + damage + "!");
    //     enemy.defend(attack);
    // }

    // public void attackMin(Unit_Character_Character enemy) {
    //     attack = (int) (damage * 0.5);
    //     System.out
    //             .println(getName() + " нанес " + enemy.getName() + " урон с минимальным повреждением " + damage + "!");
    //     enemy.defend(attack);
    // }

    // public void evasions(int defense) { // Может уклониться от атаки.
    //     if (Math.random() == 3) {
    //         defense = (int) + 20;
               
    //     }
    // }

