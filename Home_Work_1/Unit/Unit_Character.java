package Home_Work_1.Unit;

import java.util.ArrayList;
import java.util.Comparator;
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
    public String state;
    public Vector2D coords;
    private  Team team;
    
    public enum Team {
        alliance,
        soviet
    }

    public Unit_Character(int health, int damage, int defense, int speed, int posX, int posY) {
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        coords = new Vector2D(posX, posY);
        state = "Stand";
       
    }
    public Team getTeam() {
        return team;
    }
   
    public int getHealth() { 
        return this.health; 
    }

    public void setHealth(int health) {
        if (health >= 0)
            this.health = health;
    }

    public int getSpeed() { 
        return this.speed; 
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
        this.health = health + this.health > this.maxHealth ? this.maxHealth : health + this.health;//????
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
            state = "Die";
            System.out.println(getName() + " Мертв");
        }
    }

    protected String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return "Я человек!";
    }

    public int compareTo(Unit_Character other) {
        return other.speed - this.speed;
    }

    static void sortTeam (ArrayList<Unit_Character> team){
        team.sort((Comparator< Unit_Character>) new Comparator<Unit_Character>() {

            @Override
            public int compare(Unit_Character alliance, Unit_Character soviet) {
                if (soviet.getSpeed() == alliance.getSpeed()) return (int) (soviet.getHealth() - alliance.getHealth());
                else  return (int) (soviet.getSpeed() - alliance.getSpeed());
            }
        });
    }

        public int findNearest(ArrayList<Unit_Character> allCharacters) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < allCharacters.size(); i++) {
            if(min > coords.getDistance(allCharacters.get(i).coords) & !allCharacters.get(i).state.equals("Die")) {
                index = i;
                min = coords.getDistance(allCharacters.get(i).coords);
            }
        }
        return index;
    }

    public ArrayList<Unit_Character> Mine(ArrayList<Unit_Character> allCharacters) {
        ArrayList<Unit_Character> myTeam = new ArrayList<>();
        for (Unit_Character character : allCharacters) {
            if (character != this && character.team == this.team) {
                myTeam.add(character);
            }
        }
        return myTeam;
    }
    
    public ArrayList<Unit_Character> Enemy(ArrayList<Unit_Character> allCharacters) {
        ArrayList<Unit_Character> opposingTeam = new ArrayList<>();
        for (Unit_Character character : allCharacters) {
            if (character != this && character.team != this.team) {
                opposingTeam.add(character);
            }
        }
        return opposingTeam;
    }
}
