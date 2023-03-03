package Home_Work_1.Unit;

import java.util.ArrayList;
import java.util.Random;

import Home_Work_1.AnsiColors;
import Home_Work_1.Interface.GameInterface;

public abstract class Unit_Character implements GameInterface {

    protected String name;
    protected int health;
    protected int maxHealth = 100;
    protected int damage;
    protected int defense;
    protected int speed;
    protected int magic = new Random().nextInt(5) + 2;
    public String state;
    protected Vector2D coords;
    private  Team team;
    protected static int heroCnt;
    

    @Override
    public String toString() {
        return getInfo() +
                " H:" + Math.round(health) +
                " D:" + defense +
                " A:" + damage +
               " " + state;
    }

    public int[] getCoords() {return new int[]{coords.posX, coords.posY};}  
    
    public enum Team {
        alliance,
        soviet
    }

    public Unit_Character(String name, int health, int damage, int defense, int speed, int posX, int posY) {
        this.name= name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        coords = new Vector2D(posX, posY);
        state = "Stand";
        heroCnt++;
       
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
      
    protected void healed(int health) {
        this.health = health + this.health > this.maxHealth ? this.maxHealth : health + this.health;//????
    }
    public boolean isDead() {return health <= 0; }

    protected void getDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        } else {
            isDead();
            state = "Die";
        }
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
            System.out.println(AnsiColors.ANSI_RED + getName() + " Мертв"+ AnsiColors.ANSI_RESET);
        }
    }

    protected String getName(){return name;}

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

    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }
    
}
