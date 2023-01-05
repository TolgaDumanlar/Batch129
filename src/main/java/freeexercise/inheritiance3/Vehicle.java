package freeexercise.inheritiance3;

public class Vehicle {

    public int price=12000;

    public void engine(){
        System.out.println("Vehicle engine");
    }

    public Vehicle(){

        System.out.println("Vehicle1");
    }

    public Vehicle(int price){

        System.out.println("Vehicle 2:"+price);
    }
}
