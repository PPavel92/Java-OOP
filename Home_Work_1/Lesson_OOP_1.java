package Home_Work_1;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Home_Work_1.Interface.Names;
import Home_Work_1.Unit.Crossbowman;
import Home_Work_1.Unit.Monk;
import Home_Work_1.Unit.Peasant;
import Home_Work_1.Unit.Robber;
import Home_Work_1.Unit.Sniper;
import Home_Work_1.Unit.Sorcerer;
import Home_Work_1.Unit.Spearman;
import Home_Work_1.Unit.Unit_Character;
import Home_Work_1.Unit.Vector2D;
import Home_Work_1.View; 


public class Lesson_OOP_1 {

    static final int UNITS = 10;
    public static ArrayList<Unit_Character> allCharacters = new ArrayList<>();
    public static ArrayList<Unit_Character> alliance = new ArrayList<>();
    public static ArrayList<Unit_Character> soviet = new ArrayList<>();
    static int dieAlliance = 0;
    static int dieSoviet = 0;
    public static void main(String[] args) {
            
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine(); 
        TypeTeam(alliance, 0, 1);
        TypeTeam(soviet, 3, 10);
        allCharacters.addAll(alliance);
        allCharacters.addAll(soviet);
        sortTeam(allCharacters); 
        
        while (true){
            View.view();
            user_input.nextLine();
            for (Unit_Character character : allCharacters) {
                if (alliance.contains(character)) character.step(alliance, soviet);
                else character.step(soviet, alliance);
            }
            for (Unit_Character character: alliance) {
                if (character.isDead()) dieAlliance++;
            }
            if (dieAlliance == 10){
                System.out.println("******************************************Green Winner!******************************************");
                break;
            } else dieAlliance = 0;
            for (Unit_Character character: soviet) {
                if (character.isDead()) dieSoviet++;
            }
            if (dieSoviet == 10){
                System.out.println("******************************************Blue Winner!******************************************");
                break;
            } else dieSoviet = 0;
        }
    }
        
    
    

    static void TypeTeam (ArrayList<Unit_Character> team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4)+offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (1):
                    team.add(new Robber(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (2):
                    team.add(new Sorcerer(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Peasant(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (4):
                    team.add(new Crossbowman(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (5):
                    team.add(new Monk(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Spearman(getName(), new Vector2D(i + 1, posY)));
                    break;
            }
        }
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

    private static String getName() {
         String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
         return name;
    }
    
}


