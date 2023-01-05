package regular_practice.Exercises;

public class C03_MethodManupulition {
    public static void main(String[] args) {
        //Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz

        String sdr = "Learn Java earn 100000 money";
        int sonuc = sdr.replaceAll("[0-9]", "").
                replaceAll(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
        System.out.println(sonuc);

    }

}
