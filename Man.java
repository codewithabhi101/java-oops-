public class Man {
    String name;
    int age;
    String personality;

    // Constructor
    public Man(String name, int age, String personality) {
        this.name = name;
        this.age = age;
        this.personality = personality;
    }

    // Method to introduce the man
    public void introduce() {
        System.out.println("Hi, I am " + name + ". I am " + age + " years old and I am " + personality + ".");
    }

    public static void main(String[] args) {
        // Create an object of Man
        Man abhi = new Man("Abhi", 25, "friendly");
        abhi.introduce();
    }
}
