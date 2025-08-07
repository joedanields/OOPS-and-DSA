class Car {
    String model;
    String color;
    int year;

    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota Camry";
        car1.color = "Red";
        car1.year = 2020;
        car1.displayInfo();
    }
}
