package Home_Work_1.Interface;

import java.util.ArrayList;

import Home_Work_1.Unit.Unit_Character;

public interface GameInterface {
    StringBuilder getInfo();

    void step(ArrayList<Unit_Character> alliance, ArrayList<Unit_Character> soviet);

}