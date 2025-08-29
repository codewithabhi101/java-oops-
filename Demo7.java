class Car {
    String brand = "Toyota";
    int speed = 100;

    void drive() {
        System.out.println("Driving " + brand + " at " + speed + " km/h");
    }
}

public class demo7 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}
