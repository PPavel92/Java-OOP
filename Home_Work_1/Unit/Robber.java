package Home_Work_1.Unit;

// # Разбойник
public class Robber extends Warrior {
    public Robber(String name, Vector2D coords) {
        super(name, 70, 10, 7, 6, coords.posX, coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник ").append(getName());
    }
}