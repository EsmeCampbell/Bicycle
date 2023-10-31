public class Main {
    public static void main(String[] args) {
        Bicycle Esme = new Bicycle(100,"blue", "apple");
        Bicycle Jai = new Bicycle(5,"pink","adidas");
        Bicycle Nemo = new Bicycle(15,"red","champion");
        Esme.display();
        Jai.display();
        Nemo.display();

        int total = Esme.speed+Jai.speed+Nemo.speed;
        System.out.println(total);

        int avg =(Esme.speed+Jai.speed+Nemo.speed)/3;
        System.out.print(avg);
    }
}