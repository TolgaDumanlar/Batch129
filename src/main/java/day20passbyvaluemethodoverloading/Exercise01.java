package day20passbyvaluemethodoverloading;

import static day20passbyvaluemethodoverloading.PassByValue02.updateName;

public class Exercise01 {

    public static void main(String[] args) {
        String name="Tom Hanks";

        String updatedName=updateName(name,"Jr.");

        System.out.println(name);//Tom Hanks Java orijinal degeri koruma altina aldi
        System.out.println(updatedName);

        name=updateName(name,"Jr.");//burada orijinal deger degistiriliyor
    }

    public String update(String name, String add){
       name = name+" "+add;
       return  name;
    }
}
