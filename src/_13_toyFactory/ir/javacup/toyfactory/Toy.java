package _13_toyFactory.ir.javacup.toyfactory;

/**
 * Created by sinet on 3/13/2019.
 */
public class Toy {

    protected double basePrice;
    protected ToySize toySize = null;

    public Toy(double basePrice, ToySize toySize) {
        this.toySize = toySize;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPrice() {
        double price = 0;
        switch (this.toySize) {
            case SMALL:
                price = basePrice;
                break;
            case MEDIUM:
                price = basePrice * 1.5;
                break;
            case LARGE:
                price = basePrice * 2;
                break;
        }
        return price;
    }

    public double getPrice(double discount) {
        if (discount == 0)
            return getPrice();
        if (0 < discount && discount < 100)
            return getPrice() - ((getPrice() / 100) * discount);
        else
            return -1;
    }

}

enum ToySize {
    SMALL, MEDIUM, LARGE;
}
