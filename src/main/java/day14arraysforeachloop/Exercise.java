package day14arraysforeachloop;

import java.util.Arrays;

import static java.awt.Color.yellow;

public class Exercise {
    public static void main(String[] args) {
        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz, character
        //sayisi 5 den cok olan elemanlari siliniz.
        //Verilen array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var bulmaliyiz.

        String colors[]={"Red","Blue","Black","White","Purple","Green"};

        int counter=0;

        for(String w:colors){
            if(w.length()<=5){
                counter++;
            }
        }
        String newColors[]=new String [counter];

        System.out.println(Arrays.toString(newColors));
        int idx=0;

        for(String w:colors){

           if(w.length()<=5){
               newColors[idx]=w;
               counter++;
           }
        }
        System.out.println(Arrays.toString(newColors));
    }
}

