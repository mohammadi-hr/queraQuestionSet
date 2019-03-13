package _12_shapes.ir.javacup.paint;

/**
 * Created by sinet on 3/13/2019.
 */

public class Shape {
    Color color;
    Pattern pattern;

    public Shape(Color c, Pattern p) {
        this.color = c;
        this.pattern = p;
    }


}

enum Color {
    BLUE, GREEN, RED
}

enum Pattern {
    DOTTED, STRIPED, ZIGZAG
}

