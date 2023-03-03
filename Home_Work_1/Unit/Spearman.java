package Home_Work_1.Unit;


// # Копейщик
public class Spearman extends Warrior {
    public Spearman(String name, Vector2D coords) {
        super(name, 70, 10, 7, 6, coords.posX, coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник ").append(getName());
    }
}