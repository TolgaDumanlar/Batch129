package day17arraylists;

import java.util.ArrayList;

public class ArrayLists03 {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");

        //remove () index ile kullanilirsa o index'teki elemani siler.
        //remove () index ile kullanilirsa size sildigi elemani verir

        String n=cities.remove(1);//Istanbul
        System.out.println(n);//Istanbulu sildim diyor
        System.out.println(cities);

        //remove () methodu eleman ile kullanilirsa ilk gorunumu siler.
        //remove () methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden
        //true veya false verir.
        //Eger eleman List'te var ise o elemani siler ve size true der.
        //Eger eleman List'te yok ise o elemani silemediginden  size false der.
        boolean p=cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);
    }
}
