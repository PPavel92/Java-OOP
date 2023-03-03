package Home_Work_1.Unit;



// # Снайпер
public class Sniper extends Shooter {
    public Sniper(String name, Vector2D coords) {
        super(name, 60, 10, 3, 9,22, 10, coords.posX, coords.posY);
    }
    
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер ").append(getName());
    }
}