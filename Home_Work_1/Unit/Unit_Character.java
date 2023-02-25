package Home_Work_1.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Home_Work_1.Interface.GameInterface;

public abstract class Unit_Character implements GameInterface, Comparable<Unit_Character> {

    protected String name;
    protected int health;
    protected int maxHealth = 100;
    protected int damage;
    protected int defense;
    protected int speed;
    protected int magic = new Random().nextInt(20) + 2;

    public Vector2D coords;

    public Unit_Character(int health, int damage, int defense, int speed, int posX, int posY) { // ???
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        coords = new Vector2D(posX, posY);
    }

    public void setHealth(int health) {
        if (health >= 0)
            this.health = health;
    }

    public int getMaxHealth() {
        if (health >= 100)
            this.health = maxHealth;
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    protected void healed(int health) {
        this.health = health + this.health > this.maxHealth ? this.maxHealth : health + this.health;
    }

    protected void getDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        } else {
            isDead();
        }
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void defend(int damage) {
        int damageDealt = damage - defense;
        if (damageDealt < 0) {
            damageDealt = 0;
        }
        health -= damageDealt;
        if (health < 0) {
            health = 0;
        }
        System.out.println(getName() + " получил " + damageDealt + " урона!");
        if (isDead()) {
            System.out.println(getName() + " Мертв");
        }
    }

    protected String getName() {
        return null;
    }

    @Override
    public String getInfo() {
        return "Я человек!";
    }

    public int compareTo(Unit_Character other) {
        return other.speed - this.speed;
    }

    @Override
    public void step(ArrayList<Unit_Character> alliance, ArrayList<Unit_Character> soviet) {

    }

    public int findNearest(ArrayList<Unit_Character> alCharacters) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < alCharacters.size(); i++) {
            if (min > coords.getDistance(alCharacters.get(i).coords)) {
                index = i;
                min = coords.getDistance(alCharacters.get(i).coords);
            }
        }
        return index;
    }

}
