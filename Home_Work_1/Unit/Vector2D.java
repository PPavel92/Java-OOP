package Home_Work_1.Unit;

public class Vector2D {

   protected int posX;
   protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Double getDistance(Vector2D oponent){
        return Math.sqrt(Math.pow(posX - oponent.posX,2) + Math.pow(posY - oponent.posY,2));

    }
}