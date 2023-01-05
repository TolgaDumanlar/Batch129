package day30excaptionsinterface;

public class HondaRunner {
    public static void main(String[] args) {

        Civic myCivic=new Civic();
        myCivic.cool();

        Accord myAccord=new Accord();
        myAccord.cool();

        System.out.println(AC.price);//2000
        System.out.println(Engine.price);//3000
        System.out.println(Security.price);//4000
        System.out.println(AC.model);//Mitsubishi

    }
}
