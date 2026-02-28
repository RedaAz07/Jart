package geometrical_shapes;

import java.awt.Color;

public class Circle implements Drawable {
    private int radius;
    private Point center;
    private Color color;

    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
        this.color = Color.BLACK;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Circle random(double maxX, double maxY, double maxRadius) {
        int x = (int) (Math.random() * maxX);
        int y = (int) (Math.random() * maxY);
        int radius = (int) (Math.random() * maxRadius);
        Point randomCenter = new Point(x, y);
        Circle circle = new Circle(randomCenter, radius);
        circle.setColor(new Color((float)Math.random(), (float)Math.random(), (float)Math.random()));
        return circle;
        }

    @Override
    public void draw(Displayable displayable) {
        Color color = getColor();
        int centerX = (int) center.getX();
        int centerY = (int) center.getY();
        int r = (int) radius;

        int x = 0;
        int y = r;
        int d = 3 - 2 * r;

        while (x <= y) {
            // Draw 8 octants
            displayable.display(centerX + x, centerY + y, color);
            displayable.display(centerX - x, centerY + y, color);
            displayable.display(centerX + x, centerY - y, color);
            displayable.display(centerX - x, centerY - y, color);
            displayable.display(centerX + y, centerY + x, color);
            displayable.display(centerX - y, centerY + x, color);
            displayable.display(centerX + y, centerY - x, color);
            displayable.display(centerX - y, centerY - x, color);

            if (d < 0) {
                d = d + 4 * x + 6;
            } else {
                d = d + 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
    }
}