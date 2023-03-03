package Home_Work_1.Unit;

// # Монах
public class Monk extends Mage {
    public Monk(String name, Vector2D coords) {
        super(name, 50, 1, 3, 7, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах ").append(getName());
    }
}
