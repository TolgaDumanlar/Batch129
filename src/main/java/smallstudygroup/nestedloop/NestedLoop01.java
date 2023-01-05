package smallstudygroup.nestedloop;

public class NestedLoop01 {

    public static void main(String[] args) {


        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*

                ? ? ? ? ?
                ? ? ? ? ?
                ? ? ? ? ?
                ? ? ? ? ?
                ? ? ? ? ?


         */

        for (int i = 1; i <=5; i++) {
            System.out.print("?" + " ");
        }
        System.out.println();

        for (int i = 1; i <=5; i++) {
            System.out.print("?" + " ");
        }

        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print("?" + " ");
        }

        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print("?" + " ");
        }

        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print("?" + " ");
        }
        System.out.println();

        System.out.println("--------------------");
        /// nested loop

        for (int i = 1; i <=5 ; i++) {// OUTER LOOP

            System.out.print("/" + " ");
            for (int j = 1; j <=5 ; j++) {
                System.out.print("?" +" ");// INNER LOOP
            }

            System.out.println();

        }

    }
}