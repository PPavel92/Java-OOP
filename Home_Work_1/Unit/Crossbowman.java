package Home_Work_1.Unit;

// # Арбалетчик
public class Crossbowman extends Shooter {
   
    public Crossbowman(String name, Vector2D coords) {
        super(name, 60, 12, 4, 9,20, 10, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик: ").append(getName());
    }
}