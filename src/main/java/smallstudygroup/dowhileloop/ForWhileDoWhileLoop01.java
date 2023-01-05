package smallstudygroup.dowhileloop;

public class ForWhileDoWhileLoop01 {
    public static void main(String[] args) {
        // 1 ile 5 arasindaki sayilari ayni satirda yazdiriniz
        for(int i=0; i<6; i++){
            System.out.print(i+" ");
        }

        System.out.println();


       int j=0;
       while(j<6){
           System.out.print(j+" ");
           j++;
       }

        System.out.println();


       int k=0;
       do{
            System.out.print(k+" ");
            k++;
        }
       while(k<6);


    }//main

}
