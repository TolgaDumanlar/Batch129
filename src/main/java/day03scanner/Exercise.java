package day03scanner;

import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 2 rakam giriniz");
        Integer firstNumber=input.nextInt();
        Integer secondNumber=input.nextInt();

        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);

    }
}
