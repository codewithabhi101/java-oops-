class Human
{
    private int age;
    private String name;
    public int getAge(){
        return age;
    } 

    public String getName()
    {
        return name;
    }
    public class demo13

    {
        public static void main(String a[]){
            Human obj = new Human();
            //obj.age = 11;
            //obj.name = "Navin";

            System.out.println(obj.getName() + " : " + obj.getAge());
        }
    }

}