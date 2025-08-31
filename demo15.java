public class demo15 {
    String model;
    int year;

    
    public demo15(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        demo15 myCar = new demo15("Honda", 2022);
        System.out.println(myCar.model); 
        System.out.println(myCar.year);  
    }
}
