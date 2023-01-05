package freeexercise.overriding;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cats meow");
    };

    @Override//Override Annotation
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
