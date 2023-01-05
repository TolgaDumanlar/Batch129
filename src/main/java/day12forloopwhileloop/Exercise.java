package day12forloopwhileloop;

public class Exercise {
    public static void main(String[] args) {
        //Example 1: 23'den 10'a kadar ikiye bolunen sayilarini yazdiriniz

      int i=23;

      while(i>9){
          if(i%2==0){

              System.out.print(i+" ");
          }
          i--;
      }
    }
}
