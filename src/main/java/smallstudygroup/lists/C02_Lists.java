package smallstudygroup.lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Lists {
    public static void main(String[] args) {
        //Verilen bir listte tekrar eden sayilari sadece 1 tane yapan metod olusturunuz
        //[1,3,5,3,5,6,1,7]
        //[1,3,5,6,7]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println((sayilar));
        System.out.println(tekrarsizListOlustur(sayilar));

    }
    public static List<Integer> tekrarsizListOlustur(List<Integer>sayilar){
      List<Integer>tekrarsizList=new ArrayList<>();
      for(int i=0; i<sayilar.size();i++){
          if(!tekrarsizList.contains(sayilar.get(i))){
              tekrarsizList.add(sayilar.get(i));
          }
      }
       return tekrarsizList;
    }
}
