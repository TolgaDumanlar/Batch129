package smallstudygroup.lists;

import java.util.ArrayList;
import java.util.List;

public class C08_Lists {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1,"Seckin"); // Yusuf gitti, yerine Seckin geldi
        System.out.println(isimler); // [Aykut, Seckin, Ilker, Oguzhan]

        // daha onceden listede var olanlari da arsiv gibi tutmak istersek
        List<String> logListesi=new ArrayList<>();

        logListesi.add(isimler.set(2,"Cosmos"));

        System.out.println(isimler); // [Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesi); // [Ilker]


        /// index
        List<Integer> sayilarList= new ArrayList<>();
        sayilarList.add(5); // [5]
        sayilarList.add(3); // [5, 3]
        sayilarList.add(0,7); // [7, 5, 3]
        sayilarList.add(2,7); // [7, 5, 7, 3]

        // elmean almak icin
        System.out.println(sayilarList.get(2)); // 7

        System.out.println(sayilarList); // [7, 5, 7, 3]
    }
}
