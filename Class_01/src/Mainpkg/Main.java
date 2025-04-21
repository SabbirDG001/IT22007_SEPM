package Mainpkg;
import Car.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car = new Car();
        car.SetColor("Blue");
        car.SetYear(2024);
        System.out.println(car.GetColor());
        System.out.println(car.GetYear());

        // Car1
        Car1 car1 = new Car1("Blue",2022);

    }
}