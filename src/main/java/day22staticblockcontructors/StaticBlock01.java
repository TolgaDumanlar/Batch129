package day22staticblockcontructors;

public class StaticBlock01 {
    //Bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initialze"(baslatmak) etmediniz demektir
    // static variable'lar static block'lar icinde initialize edilirse o class'in icinden herseyden once hazir hale
    //getirilmis olur. Bazen main method calistirmadan once variable'larin hazir hale getirilmesi gerekir bu yuzden
    //static block'lar kullanilir.

    //Note1:Static blocklar static variablelari initialize etmek icin kullanilirlar
    //Note 2:Static blocklar class icinde herseyden once calistirilirlar.
    static double pi;
    static String shape;

    static {
        pi=3.14;
        System.out.println(pi);
        System.out.println("Static block 1");
    }

    static {
        shape="Circle";
        System.out.println(shape);
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        pi=3.14;
        System.out.println(pi);
    }
}
