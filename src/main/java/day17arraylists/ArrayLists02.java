package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
       //ArrayList olustururken sag tarafa (constructor) ArrayList yazmak zorundasiniz
       //Ama sol tarafa ister ArrayList yazin isterseniz List yazin ikisi de calisir.

        ArrayList<Character> initials=new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir List'te kac eleman oldugunu nasil anlariz?
        int numOfElement=initials.size();
        System.out.println(numOfElement);
        //Note:Arrey'lerden bahsederken "lenght" kullanin, List'lerden bahsederken size kullanin.

        //Bir List'ten istenen bir eleman nasil alinir?
        char u=initials.get(2);
        System.out.println(u);//M

        //Example 1:Verilen bir String List'teki tum elemanlarin toplam karekter sayilarini bulun kodu yaziniz.
        ArrayList<String>cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        //1.Yol
        int sum=0;
        for(String w: cities){

            sum=sum+w.length();
        }
        System.out.println(sum);

        //2.Yol
        int toplam=0;
        for(int i=0; i< cities.size(); i++){
            toplam=toplam+cities.get(i).length();
        }
        System.out.println(toplam);

        //Bir List'deki istenen bir elemani nasil degistirebiliriz?
        cities.set(0,"New York");
        System.out.println(cities);//[New York, Istanbul, Kayseri, Almaty]

        //Example 2:Maas List'i olusturunuz ve maaslara %20 zam yapiniz.
        List<Double> salary=new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.25);
        salary.add(32500.50);
        //1.Yol
        int idx=0;
        for(double w: salary){
                                    //19500.25, 8500.25, 32500.50
            salary.set(idx, w*1.20);
            idx++;
        }
        System.out.println(salary);


        //2.yol

        for(int i=0;i<salary.size();i++){
            salary.set(i,salary.get(i)*1.20);
        }
        System.out.println(salary);
    }
}
