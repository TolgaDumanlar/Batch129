package day22staticblockcontructors;

public class Araba {

    String make="Honda";
    String model="Accord";
    int modeli=2023;
    boolean hybrid=true;

    public Araba(String make, String model, int modeli, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.modeli = modeli;
        this.hybrid = hybrid;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modeli=" + modeli +
                ", hybrid=" + hybrid +
                '}';
    }
}
