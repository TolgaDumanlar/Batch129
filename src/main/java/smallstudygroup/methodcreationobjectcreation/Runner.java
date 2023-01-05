package smallstudygroup.methodcreationobjectcreation;

public class Runner {

    public static void main(String[] args) {

    Okul obj=new Okul();

        System.out.println(obj.okulIsmi);
        System.out.println(obj.isActive);
        System.out.println(obj.yil);

        //olusturdugumuz object ismi ile cagirma islemi yapiyoruz...

        Okul.okulIsmi("Start okulu");

        System.out.println(obj.yilYazdir(2023));

        System.out.println();

    Calculator.cikarma(6,1);
    }

    //Staticler sadece class ismi ile calisir
}
