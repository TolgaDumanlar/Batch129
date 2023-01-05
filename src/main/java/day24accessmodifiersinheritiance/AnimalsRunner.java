package day24accessmodifiersinheritiance;

public class AnimalsRunner {
    public static void main(String[] args) {

        Cat myCat =new Cat();

        myCat.meow();
        myCat.eat();
        myCat.drink();

        Dog myDog=new Dog();
        myDog.bark();
        myDog.eat();
        myDog.drink();

        Bird myBird=new Bird();
        myBird.tweet();;
        myBird.drink();
        myBird.eat();

    }
}
