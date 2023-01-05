package day22staticblockcontructors;

import day22staticblockcontructors.Araba;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba a1=new Araba("BMW","M4",2023,false);
        Araba a2=new Araba("Audi","R8",2022,false);
        Araba a3=new Araba("Honda","Civic",2000,false);


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }


}
