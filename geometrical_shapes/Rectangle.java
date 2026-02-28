package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void draw(Displayable displayable) {
        Color color = getColor();
        Point p3 = new Point(getP1().getX(), getP2().getY());
        Point p4 = new Point(getP2().getX(), getP1().getY());
        Line l1 = new Line(getP1(), p3, color);
        Line l2 = new Line(p3, getP2(), color);
        Line l3 = new Line(getP2(), p4, color);
        Line l4 = new Line(p4, getP1(), color);

        l1.draw(displayable);
        l2.draw(displayable);
        l3.draw(displayable);
        l4.draw(displayable);
    }

}
