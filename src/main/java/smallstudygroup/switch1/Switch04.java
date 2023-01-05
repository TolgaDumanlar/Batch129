package smallstudygroup.switch1;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        //ingilizce de Ünlü veya Ünsüz harflerini kontrol etmek için bit program yaziniz:
        //ingilizce de Ünlü veya Ünsüz harflerini kontrol etmek için bit program yaziniz:

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir ingilizce harfi yaziniz");
        char ch=input.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                System.out.println("UNLU HARF");
                break;
            default:
                System.out.println("Unsuz Harf");
        }
    }
}
