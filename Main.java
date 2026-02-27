

import geometrical_shapes.Image;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        /* Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);

        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        } */
        image.save("image.png");
    }
}
