package geometrical_shapes;

import java.awt.Color;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }


    public void draw(Displayable displayable) {
        Color color = getP1().getColor();
        Line l1 = new Line(getP1(), getP2(), color);
        Line l2 = new Line(getP2(), getP3(), color);
        Line l3 = new Line(getP3(), getP1(), color);
        l1.draw(displayable);
        l2.draw(displayable);
        l3.draw(displayable);
    }

}
