package _6_carFactory;

/**
 * Created by Mohammadi-HR on 3/9/2019.
 */
public class Car {

    int weight;
    String color;
    String name;

    {
        this.weight = 500;
        this.color = "White";
        this.name = "Fride";
    }

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String color) {
        this.color = color;
        this.name = name;
    }
}
