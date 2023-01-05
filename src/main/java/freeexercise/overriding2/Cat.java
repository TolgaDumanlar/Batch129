package freeexercise.overriding2;

public class Cat extends Mammals{

    public void meow(){
        System.out.println("Cats meow");
    }

    @Override  //Override Annotation'i
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public Mammals create() {

        return super.create();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return super.multiply(a, b);
    }
}
