package smallstudygroup.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();//Onerilen
//        ArrayList<Integer> list2=new ArrayList<Integer>();
//        Collection<Integer> list3=new ArrayList<Integer>();

        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        System.out.println(list);
        for(int i=0; i<list.size();i++){
            //System.out.print(i);//bu index numarasini yazdirir
            System.out.println(list.get(i));//get elemanin indexini deil kendisini verir
        }
        System.out.println("---------------------");
        for(int w:list){
            System.out.print(w);
        }

    }
}
