package _13_toyFactory.ir.javacup.toyfactory;

/**
 * Created by sinet on 3/13/2019.
 */
public class Car extends Toy {
    public Car(double basePrice, ToySize toySize) {
        super(basePrice, toySize);
    }

    public double getPrice(){
        double price = 0;
        switch (toySize) {
            case SMALL:
                price = basePrice * 2;
                break;
            case MEDIUM:
                price = basePrice * 2.5;
                break;
            case LARGE:
                price = basePrice * 3;
                break;
        }
        return price;
    }
}
