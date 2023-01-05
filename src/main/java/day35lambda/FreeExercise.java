package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class FreeExercise {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        elementlerBosluk(nums);
        System.out.println();
        tekSayi(nums);
        System.out.println();






    }
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static  void elementlerBosluk(List<Integer> nums){

        nums.stream().forEach(t-> System.out.print(t+" "));
    }
    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static  void tekSayi(List<Integer> nums){
        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.println(t+" "));
    }
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk
    //  koyarak yazdiran method'u olusturunuz.(Functional)
    public static  void tekSayiTekrarsiz(List<Integer> nums){
        nums.stream().distinct().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }

    //7. cift sayilarin tekrarsiz olarak kareleri toplami yazdiran method

    public static void ciftSayi(List<Integer> nums){
        nums.stream().distinct().filter(t->t%2!=0).map(t->t*t).reduce(1,(t,u)->t+u);

    }
    //Tekrarsız sayıların karelerinin toplamını gösteren methodu yazınız


}
