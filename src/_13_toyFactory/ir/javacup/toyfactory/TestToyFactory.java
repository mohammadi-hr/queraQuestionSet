package _13_toyFactory.ir.javacup.toyfactory;

/**
 * Created by sinet on 3/13/2019.
 */
public class TestToyFactory {
    public static void main(String[] args) {
        /*Car car = new Car(1000, ToySize.LARGE);
        System.out.print(car.getPrice(10));*/


        Toy toy = new Toy(20000, ToySize.SMALL);
        System.out.println(toy.getPrice());
        System.out.println(toy.getPrice(20));

    }
}
