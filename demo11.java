class Student {
    private int age;

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }
}

public class demo11{
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println("Age: " + s.getAge());
    }
}
