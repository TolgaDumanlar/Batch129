package regular_practice.nighttime07;

public class StringBuilderKiyasExercise {
    /*
     * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
     * kontrol edip StringBuilder ve String class'larinin performanslarini
     * karsilastiralim.
     * Ipucu: long TimeSb = System.nanoTime(); kullanalim
     */

    public static void main(String[] args) {

        String str="Merhaba";

        long time1=System.nanoTime();

        for(int i=0; i<1000; i++){
            str+=" ";
        }
        long time2=System.nanoTime();

        long stringSure=time2-time1;


        System.out.println("------------------------------------");

        StringBuilder sb=new StringBuilder("Merhaba");
        long time3=System.nanoTime();
        for(int i=0; i<1000; i++){
            str+=" ";
        }
        sb=sb.append(" ");
        long time4=System.nanoTime();
        long stringBuilder=time4-time3;

        if(stringBuilder>stringSure){
            System.out.println("stringBuilder daha yavas");
        }else if(stringBuilder<stringSure){
            System.out.println("String daha yavas");
        }else {
            System.out.println("Ikiside esit");
        }
    }
}
