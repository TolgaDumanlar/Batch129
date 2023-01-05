package day03scanner;

public class CarRepeat {

    public String studentName=("Hasan Can");
    public int studentAge=18;
    public double studentHeight=1.80;

    public static void main(String[] args) {

        CarRepeat myCar=new CarRepeat();
        System.out.println(myCar.studentAge);
        System.out.println(myCar.studentHeight);
        System.out.println(myCar.studentName);
        myCar.dersler();
        myCar.hayati();

    }

    public void dersler (){
        System.out.println("Duzenli ders calisir");}
    public void hayati (){
        System.out.println("Aksamlari rken yatar");
    }

}//Class'in bodysi
