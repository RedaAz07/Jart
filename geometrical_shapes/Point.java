package geometrical_shapes;

public class Point implements Drawable {
    private int x;
    private  int y;

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

    public Point random(int width, int height) {
        int x1 = (int) (Math.random() * width);
        int y1 = (int) (Math.random() * height);
        return new Point(x1, y1);
    }
    

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, getColor());
    }

}