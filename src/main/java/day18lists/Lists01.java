package day18lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //Example 1:Integer bir List olusturunuz.
        //List'e 5 tane eleman ekleyiniz
        //bu elemanlardan 12'yi siliniz.

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);

        //Siz Java'da tamsayi yazdiginizda Java o tam sayinin data type'ni otomaatik olarak primitive int kabul eder.
        //Bu yuzden remove metodunun icine yazdigini tamsayi eleman olarak degil index olarak kabul edilir.
        //Tamsayi'yi eleman olarak gostermenin birkac yolu vardir.

        //1.Yol
        // Integer nonPrimitive=12;
       // ages.remove(nonPrimitive);    //ilk 12'yi siler

        //2.yol :Recomended
        ages.remove((Integer) 12);        //ilk 12'yi siler


        //3.Yol
        //ages.remove(Integer.valueOf(12));     //ilk 12'yi siler  2 metod kullanildi.

        //4.Yol
        //ages.remove(ages.indexOf(12));        //ilk 12'yi siler, 2 metod kullanildi.
        System.out.println(ages);



        //Example 2://Example 1:Integer bir List olusturunuz.
        //        //List'e 5 tane eleman ekleyiniz
        //        //bu elemanlardan 12'lerin tamamini siliniz.
        //
                ArrayList<Integer> nums = new ArrayList<>();
                ages.add(10);
                ages.add(25);
                ages.add(12);
                ages.add(8);
                ages.add(12);

        List<Integer>silinecekler=new ArrayList<>();
        silinecekler.add(12);

        //removeAll() Method'u List ile calisir.
        //removeAll() Method'u bir veya birden fazla elemanin tum gornumlerini silmek icin kullanilir.

        nums.removeAll(silinecekler);

        System.out.println(nums);
    }

}
