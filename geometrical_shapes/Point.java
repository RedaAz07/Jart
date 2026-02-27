package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, getColor());
    }

    @Override
    public Color getColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }
}