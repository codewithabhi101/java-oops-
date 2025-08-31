public class demo14 {
    String model;
    int year;

    // Default constructor
    public demo14() {
        System.out.println("Default constructor called");
        model = "Toyota";
        year = 2020;
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.model); // Toyota
        System.out.println(myCar.year);  // 2020
    }
}
