package Unit;

public abstract class Mage extends Unit_Character{

    int shots, maxShots;
    float dist;
    String name;

    public Mage(int health, int damage, int magic, int speed, int shots, int maxShots, float dist) {
        super(health, damage, speed);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    public float getDist(){
        return dist;
    }
}