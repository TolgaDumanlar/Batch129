package smallstudygroup.lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Lists {
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        double toplam=0.0;
        for(double w:sayilar){
        toplam=toplam+w;
        }

        double ortalama=toplam/sayilar.size();
        System.out.println(ortalama);


        List<Double>ortalamaninUstundekiSayilar=new ArrayList<>();

        for(double w:sayilar){
            if(w>ortalama){
                ortalamaninUstundekiSayilar.add(w);
            }
        }


        System.out.println(ortalamaninUstundekiSayilar);

    }
}
