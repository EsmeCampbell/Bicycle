public class Bicycle {
    public int speed;

    public String color;

    public String brand;


    public Bicycle(int pSpeed, String pColor, String pBrand){
        speed = pSpeed;
        color = pColor;
        brand = pBrand;
    }
    public void display(){
        System.out.println("Speed is " + speed + " Color is" + color + " Brand is" + brand + ".");
    }
}
