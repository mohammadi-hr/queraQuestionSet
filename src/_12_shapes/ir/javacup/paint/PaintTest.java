package _12_shapes.ir.javacup.paint;

/**
 * Created by sinet on 3/13/2019.
 */
public class PaintTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(Color.BLUE, Pattern.DOTTED, 10);
        Circle circle2 = new Circle(Color.BLUE, Pattern.DOTTED, 10);

        Square s1 = new Square(Color.BLUE, Pattern.DOTTED, 10);
        Square s2 = new Square(Color.BLUE, Pattern.STRIPED, 10);
        System.out.println(circle1.equals(circle2));
        System.out.println(s1.equals(s2));
        System.out.println(circle1.getClass().getName());
    }
}
