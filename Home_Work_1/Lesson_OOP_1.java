package Home_Work_1;

import java.util.ArrayList;
import java.util.Random;

import Home_Work_1.Interface.Names;
import Unit.Crossbowman;
import Unit.Mage;
import Unit.Monk;
import Unit.Peasant;
import Unit.Robber;
import Unit.Sniper;
import Unit.Sorcerer;
import Unit.Spearman;
import Unit.Unit_Character;
import Unit.Warrior;

public class Lesson_OOP_1 {
    public static void main(String[] args) {

        ArrayList<Unit_Character> characters = new ArrayList<>();
        

        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            int type = rand.nextInt(7);
            String name = getName();
 
            switch (type) {
                case 0:
                    characters.add(new Peasant(name));
                    break;
                case 1:
                    characters.add(new Robber(name));
                    break;
                case 2:
                    characters.add(new Sniper(name));
                    break;
                case 3:
                    characters.add(new Sorcerer(name));
                    break;
                case 4:
                    characters.add(new Spearman(name));
                    break;
                case 5:
                    characters.add(new Crossbowman(name));
                    break;
                case 6:
                    characters.add(new Monk(name));
                    break;
                   
            }
        }

            for (Unit_Character character : characters) {
            System.out.println(character.getInfo() + "\n" + character + "\n");
            
        }
    
    }
    
        private static String getName(){
            String name= String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
            return name;
        }
        
}

