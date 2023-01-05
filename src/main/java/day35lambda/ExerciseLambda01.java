package day35lambda;

import java.util.ArrayList;
import java.util.List;

import static day35lambda.Lambda01.printElements2;

public class ExerciseLambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements2(nums);
        System.out.println();
        printEvenElements02(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();
        printProductOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        getMaxValue(nums);


    }

    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

      public static void printElement2(List<Integer> nums){
          nums.stream().forEach(t -> System.out.print(t + " "));
      }

    //Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
        public static void printEvenElements02(List<Integer> nums){
      nums.
              stream().
              filter(t->t%2==0).
              forEach(t-> System.out.print(t+" "));
    }
    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda
    //  aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

        public static void printSquareOfOddElements(List<Integer> nums){
        nums.stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));
        }

    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina
    //  bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));

    }
    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        Integer sum = nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(0, (t, u)->t+u);
                System.out.println(sum);
    }

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    //Farkli çift elemanların küplerinin çarpımını hesaplayın.

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){
       Integer sum= nums.
               stream().
               distinct().
               filter(t->t%2==0).
               map(t->t*t).
               reduce(1,(t,u)->t*u);
        System.out.println(sum);
    }

    //9)Create a method to find the "maximum value" from the list elements

    public static void getMaxValue(List<Integer>nums){
        Integer max=nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.println(max);
    }

    public static void getMaxValue1(List<Integer>nums){
        Integer max=nums.stream().distinct().reduce(nums.get(0),(t,u)->t>u?t:u);
        System.out.println(max);
    }










































}
