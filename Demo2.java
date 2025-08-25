class calculator
{
    public int add(int  n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public int add1(int n1, int n2)
    {
        return n1 + n2;
    }
}

public class Demo2{
    public static void main(String a[])
    {
        calculator obj = new calculator();
        int r1 = obj.add1(3, 4);
        System.out.println(r1);
    }
}