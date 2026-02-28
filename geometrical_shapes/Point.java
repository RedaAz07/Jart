package geometrical_shapes;

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

  
}