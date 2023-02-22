package Home_Work_1.Unit;
import java.util.Random;

import Home_Work_1.Interface.GameInterface;

public abstract class Unit_Character implements GameInterface, Comparable<Unit_Character>{

        protected String name;
        protected int health;
        protected int maxHealth = 100;
        protected int damage;
        protected int defense;
        protected int speed;
        protected int magic = new Random().nextInt(20)+2;
    
        
    
        public Unit_Character(int health, int damage, int defense, int speed) {
            this.health = health;
            this.damage = damage;
            this.defense = defense;
            this.speed = speed;
        }

        public void setHp(int health) 
        {if (health >= 0) this.health = health;}
    
        public int getMaxHealth() {
            if (health >= 100)
            this.health = maxHealth;
            return maxHealth;
        }
    
        public void setMaxHealth(int maxHealth) {
            this.maxHealth = maxHealth;
        }
    
        public void setHealth(int health) {
            this.health = health;
        }
    
        protected void healed(int health) {
            this.health = health + this.health > this.maxHealth ? this.maxHealth : health + this.health;
        }
    
        protected void getDamage(int damage) {
            if (this.health - damage > 0) {
                this.health -= damage;
            }
            //  else { die(); } //// доделать смерть
        }



        
    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я человек!";
    }

    public int compareTo(Unit_Character other) {
        return other.speed - this.speed;
    }
    
}
