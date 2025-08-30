class Human
{
    private int age;
    private String name;
    public int getAge(){
        return age;
    } 
    public void setAge(int age){
        age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}
    public class demo13

    {
        public static void main(String a[]){
            Human obj = new Human();
            obj.setAge (28);
            obj.setName ("Abhi");

            System.out.println(obj.getName() + " : " + obj.getAge());
        }
    }

