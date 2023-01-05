package freeexercise.overriding2;

public class Animal {

    public void eat(){
        System.out.println("Animals eat");
    }


    public void drink(){
        System.out.println("Animals drink");
    }

    public Mammals create(){
        return new Cat();
    }

    public int add(int a, int b){
       return a+b;
    };

    public Integer multiply(int a, int b){
      return a*b;
    }
}
