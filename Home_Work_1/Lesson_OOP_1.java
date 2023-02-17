package Home_Work_1;

import Home_Work_1.Unit.Crossbowman;
import Home_Work_1.Unit.Monk;
import Home_Work_1.Unit.Peasant;
import Home_Work_1.Unit.Robber;
import Home_Work_1.Unit.Sniper;
import Home_Work_1.Unit.Sorcerer;
import Home_Work_1.Unit.Spearman;

public class Lesson_OOP_1 {
    public static void main(String[] args) {
        Peasant john = new Peasant("John", 50, 5, 10);
        Robber rob = new Robber("Rob", 60, 10, 20);
        Sniper tom = new Sniper("Tom", 40, 20, 5);
        Sorcerer merlin = new Sorcerer("Merlin", 30, 15, 15);
        Spearman lance = new Spearman("Lance", 70, 10, 15);
        Crossbowman bob = new Crossbowman("Bob", 10, 15, 5);
        Monk jin = new Monk("Jin", 90, 5, 25);

        
        // jin.heal(bob);
        // System.out.println(john);
        // System.out.println("\n"+rob);
        // System.out.println("\n"+tom);
        // System.out.println("\n"+merlin);
        // System.out.println("\n"+lance);
        System.out.println("\n"+bob);
        System.out.println("\n"+jin);
        jin.attack(bob);
        bob.attack(jin);
        System.out.println("\n"+jin);
        bob.attack(jin);
        System.out.println("\n"+jin);
        bob.attack(jin);
        System.out.println("\n"+jin);
        bob.attack(jin);
        bob.attack(jin);
        bob.attack(jin);
        System.out.println("\n"+jin);
        jin.heal(jin);
        // System.out.println("\n"+bob);
        // System.out.println("\n"+jin);
        // jin.heal(bob);
        // System.out.println("\n"+bob);
        // System.out.println("\n"+jin);
        // jin.heal(bob);
        // jin.heal(jin);
        // System.out.println("\n"+bob);
        System.out.println("\n"+jin);
    }
}