package freeexercise.excaptionsinterface;

public class Accord implements Ac,Engine,Security{
    @Override
    public void cool() {
        System.out.println("Accord cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Engine run super");
    }
}
