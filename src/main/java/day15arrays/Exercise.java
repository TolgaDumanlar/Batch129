package day15arrays;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U
        String s = "Java brings you money";
      int harf=s.replaceAll("[^aeiouAEIOU]","").length();
        System.out.println(harf);
    }
}
