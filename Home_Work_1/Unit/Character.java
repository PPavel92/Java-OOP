package Home_Work_1.Unit;

import java.util.Random;

public class Character {
    protected String name;
    protected int health;
    protected int maxHealth = 100;
    protected int damage;
    protected int speed;
    protected int magic = new Random().nextInt(20)+2;

    

    public Character(String name, int health, int damage, int speed) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Character target) {
        if (target.health <= 0);
    }
   
    public void heal(Character target) {
        if (target.health <= 0) {
            int newHealth = target.health + this.magic;
            if (newHealth > target.getMaxHealth()) {
                newHealth = target.getMaxHealth();
            }
            target.setHealth(newHealth);
            
        } 
    }
}   

