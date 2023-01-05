package regular_practice.daytime07;

public class CarRunner {
    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

       // System.out.println(car1.counter);//Tavsiye edilmez

        System.out.println(Car.counter);//4
        System.out.println(car1.price);//20001

        System.out.println(Car.counter);//4
        System.out.println(car2.price);//20001

        System.out.println(Car.counter);//4
        System.out.println(car3.price);//20001

        System.out.println(Car.counter);//4
        System.out.println(car4.price);//20001


    }
}
