public class Demo17 {
    String name;
    int age;

    // Default constructor
    public Demo17() {
        System.out.println("Default constructor called.");
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Demo17(String name, int age) {
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.age = age;
    }

    // Method to display object data
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Using default constructor
        Demo17 obj1 = new Demo17();
        obj1.displayInfo();

        // Using parameterized constructor
        Demo17 obj2 = new Demo17("John", 25);
        obj2.displayInfo();
    }
}
