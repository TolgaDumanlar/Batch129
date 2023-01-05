package day07ifstatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz

        Scanner input=new Scanner((System.in));
        System.out.println("Gun giriniz");
        String t=input.nextLine();
        int sum=1;
        if(t.equalsIgnoreCase("Pazar")){
            System.out.println(sum+". gun");
        }else if(t.equalsIgnoreCase("Pazartesi")) {
            System.out.println(sum + ". gun");
            sum++;

        }else {
            System.out.println("Gun degil");
        }
        System.out.println(sum);

    }
}
