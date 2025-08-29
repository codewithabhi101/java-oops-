class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class demo9 {
    public static void main(String[] args) {
        Shape s = new Circle();  // Polymorphism
        s.draw();  // Outputs: Drawing circle
    }
}
