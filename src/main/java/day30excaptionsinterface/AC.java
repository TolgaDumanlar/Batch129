package day30excaptionsinterface;

public interface AC {

    //interface'lerin icine "concrete" method konulamaz, cunku "concrete method"larda body vardir ve body o method'un isi
    //nasil yapacagını belirtir. Isin nasil yapilacagı bir cok detay icerir ve bu Child Class'larda kafa karisikligina sebep
    //olur. Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacağıni Child'a birakirsaniz Child Class'in kafa
    //karisikligini engellemis olursunuz.

    //interface'ler "concrete" method'lar iceremezler, dolayisiyla interface'in icindeki hicbirsey istege baglı degildir.
    //hersey "Child Class"lar icin mecburidir. Bu yuzden interface'lere "to-do list" de denir.

    //interface'lerdeki tum metodlar otomadik olarak "public"dir, "abstract"dir, "static" degildir"

    //interface'deki methodlar otomatik olarak "public"tir, "static"tir, "final"dir.

    void cool();

    void run();

    public static final int price=2000;
    String model="Mitsubishi";

    }

