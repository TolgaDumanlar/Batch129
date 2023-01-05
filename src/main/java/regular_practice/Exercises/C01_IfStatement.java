package regular_practice.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*
        Kullanicidan bir gun alin, eger gun cuma ise "Muslumanlar icin kutsal gun";
        eger gun cumartesi ise "Yahudiler icin kutsal gun";
        eger gun pazar ise "Hristiyanlar icin kutsal gun"; yazdiran kodu olusturunuz.*/
        Scanner input=new Scanner (System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun=input.next().toLowerCase();

        if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        } else {
            System.out.println("Gecersiz gun");
        }
    }

    public static class ArrayLists02 {

        public static void main(String[] args) {
             // Verilen bir Listteki elemanlari tekrarsiz olarak yazdirma

            List<Integer> a = new ArrayList<>();
            a.add(2);
            a.add(3);
            a.add(2);
            a.add(2);
            a.add(5);
            System.out.println("a = " + a);  //a = [2, 3, 2, 2, 5]

            List<Integer> yeniList = new ArrayList<>();
                            //[2, 3, 2, 2, 5]
            for (Integer w : a) {
                if(!yeniList.contains(w)){
                    yeniList.add(w);
                }
            }
            System.out.println("yeniList = " + yeniList);


            //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
            //gosteren kodu yaziniz.
            //Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
            //           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
            //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

            Scanner input= new Scanner(System.in);
            List<String> c = new ArrayList<>();
            c.add("A");
            c.add("K");
            c.add("R");
            c.add("S");
            System.out.println("c = " + c);//c = [A, K, R, S]
            String urun ="";

            do {
                System.out.println("Lutfen istediginiz urunun harfini giriniz");
                urun= input.next().substring(0,1);

                if(c.contains(urun)){
                    c.set(c.indexOf(urun),"Ayrildi");

                }else if(!urun.equals("Q")){
                    c.add(urun);
                }
                System.out.println(c);

            }while (!urun.equals("Q"));
        }
    }

    public static class C01_Lists {
        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("Hakan");
            names.add("Yunus");
            names.add("Ayse");
            names.add("Zisan");
            names.add("Sevcan");
            names.add("Omer");

            List<String> males = new ArrayList<>();
            males.add("Hakan");
            males.add("Yunus");
            males.add("Ali");

            names.retainAll(males);
            System.out.println("names = " + names);//names = [Hakan, Yunus] ortak olmayanlar siliniyor
            System.out.println("males = " + males);//males = [Hakan, Yunus, Ali] degismez aynen kalir

            // Listeden belirli bir araliktaki datalari getirme
            List<String> sanatci = new ArrayList<>();
            sanatci.add("Ajda");
            sanatci.add("Cuneyt");
            sanatci.add("Mahsun");
            sanatci.add("Muslum");
            sanatci.add("Orhan");
            System.out.println("sanatci = " + sanatci);
            sanatci.subList(1,3);
            System.out.println( sanatci.subList(1,3));
            //subList sout'un icinde yazdirilabilir ya da atama yapip conteyner'in adi yazdirilabilir

        }

    }
}
