package smallstudygroup.stringmanipulation;

public class C04_stringManupulation {
    public static void main(String[] args) {
        /*  Kisi isimleri icin 3 String degisken olusturunuz. bosluk karektleri haric 3 isimdeki
        karakter sayisinin toplamini yazdiriniz.*/

        String isim1="ahmet furkan";
        String isim2="omer faruk";
        String isim3="ayse nur";

        int a1=isim1.replaceAll(" ","").length();
        int a2=isim2.replaceAll(" ","").length();
        int a3=isim3.replaceAll(" ", "").length();

        System.out.println(a1+a2+a3);


    }
}
