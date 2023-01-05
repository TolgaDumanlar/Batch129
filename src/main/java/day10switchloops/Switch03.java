package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Example:Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain,
        // Bulgaria, Albania, France"Type code to print abbreviation of the countries.
        // "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

        Scanner input = new Scanner(System.in);
        System.out.println("Ulke adi giriniz");
        String countryName = input.nextLine();
        switch (countryName.toLowerCase()) {

            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("EN");
                break;
            case "germany":
                System.out.println("GER");
                break;
            case "turkey":
                System.out.println("TUR");
                break;
            case "india":
                System.out.println("IND");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albenia":
                System.out.println("ALB");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Lutfen gecerli ulke ismi giriniz");
        }
    }
}