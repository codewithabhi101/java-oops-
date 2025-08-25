class Calculator {
    public int add(int n1, int n2) {
        int num = 5;   // just to print something inside method
        System.out.println(num);
        return n1 + n2;
    }
}

public class Demo3 {
    public static void main(String a[]) {
        int data = 10;

        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
