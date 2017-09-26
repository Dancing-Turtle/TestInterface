import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.util.Random;

public class MakeSquare implements Shapes {
    private Rectangle rect;
    private int x, y;
    static Main main;
    Color color;

    public MakeSquare(){
        rect = new Rectangle(50, 50);

    }

    public MakeSquare(int x, int y, Color color){
        this.x = x;
        this.y = y;
        rect = new Rectangle(x, y, color);
    }

    public MakeSquare(int x, int y, int locationX, int locationY, Color color){
        this.x = x;
        this.y = y;
        rect = new Rectangle(x, y, color);
        rect.setTranslateX(locationX);
        rect.setTranslateY(locationY);
        rect.setOnMousePressed(this::actiononpress);
    }

    private void actiononpress(MouseEvent mouseEvent) {
        Random rand = new Random();
        rect.setTranslateX(rand.nextInt(1200));
        rect.setTranslateY(rand.nextInt(680));
        System.out.println("Pressed");
    }


    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Shape getObj() {
        return rect;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
