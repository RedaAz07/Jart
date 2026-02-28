package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    private Point start;
    private Point end;
    private Color color;

    public Line(Point start, Point end, Color color) {
        this.start = start;
        this.end = end;
        this.color = color;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public void draw(Displayable displayable) {
        double x0 = start.getX();
        double y0 = start.getY();
        double x1 = end.getX();
        double y1 = end.getY();
        double dx = x1 - x0;
        double dy = y1 - y0;
        double step = Double.max(Math.abs(dx), Math.abs(dy));
        double x_inc = dx / step;
        double y_inc = dy / step;
        double x = x0;
        double y = y0;

        for (int i = 0; i <= step; i++) {
            displayable.display((int) Math.round(x), (int) Math.round(y), this.color);
            x += x_inc;
            y += y_inc;
        }

    }

}