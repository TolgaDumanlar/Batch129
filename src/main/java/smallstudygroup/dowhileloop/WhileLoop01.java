package smallstudygroup.dowhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayilari tam bolen sayilari ve toplam kac  tane olduklarini ekranda yazdirin
        int input=6;
        int bolen=1;
        int sayac=0;
/*
        while(bolen<=input){

            if(input%bolen==0){
                System.out.print(bolen + " ");
                sayac++;
            }

            bolen++;
        }
        System.out.println();
        System.out.println(input+" sayisini bolen " +sayac+" sayi vardir ");
*/

        do{
            if(input%bolen==0){
                System.out.print(bolen + " ");
                sayac++;
            }
            bolen++;
        }while(bolen<=input);
        System.out.println();
        System.out.println(input+" sayisini bolen " +sayac+" sayi vardir ");


    }
}
