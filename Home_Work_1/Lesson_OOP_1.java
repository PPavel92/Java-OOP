package Home_Work_1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Home_Work_1.Interface.Names;
import Home_Work_1.Unit.Crossbowman;
import Home_Work_1.Unit.Monk;
import Home_Work_1.Unit.Peasant;
import Home_Work_1.Unit.Robber;
import Home_Work_1.Unit.Sniper;
import Home_Work_1.Unit.Sorcerer;
import Home_Work_1.Unit.Spearman;
import Home_Work_1.Unit.Unit_Character;


public class Lesson_OOP_1 {
    public static void main(String[] args) {

        Random random = new Random();
    List<Unit_Character> alliance = new ArrayList<>();
    List<Unit_Character> Soviet = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
        int type = random.nextInt(4); 
        String name = getName();
        switch (type) {
            case 0:
                alliance.add(new Peasant(name));
                break;
            case 1:
                alliance.add(new Robber(name));
                break;
            case 2:
                alliance.add(new Sniper(name));
                break;
            case 3:
                alliance.add(new Sorcerer(name));
                break;
        }
        System.out.println(alliance);
    }

    
    for (int i = 0; i < 5; i++) {
        int type = random.nextInt(4); 
        String name = getName();
        switch (type) {
            case 0:
                Soviet.add(new Peasant(name));
                break;
            case 1:
                Soviet.add(new Spearman(name));
                break;
            case 2:
                Soviet.add(new Crossbowman(name));
                break;
            case 3:
                Soviet.add(new Monk(name));
                break;
        }
    }
System.out.println("________________________");
    List<Unit_Character> allCharacters = new ArrayList<>(alliance);
    allCharacters.addAll(Soviet);
    Collections.sort(allCharacters);

    for (Unit_Character character : allCharacters) {
        System.out.println(character);
    }

}

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

}
