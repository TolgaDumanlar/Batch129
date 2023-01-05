package day24accessmodifiersinheritiance;

public class  Student {

    public String name="Tom Hanks";//name herkes tarafindan bilinebilir, o yuzden public yaptim
    String stdId="TH2023HU12001";//student ıd okul yonetimindeki insanlar tarafindan bilinebilir. o yuzden default
    protected int accountNum=76512345;// account number ben, esim ve cocuklarim tarafindan bilinebilir, o yuzden protected
    private int balance=123000;//hesabimdaki para miktari sadece benim tarafindan bilinmelidir. o yuzden private yaptim
/*
        1)Access modifier'lar genis'den dara; public > protected > default > private
        2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
        3)Access Modifier'lar ne ise yarar?
        Variablelara methodlara classlara ulasmayi duzenler.
        4)Kac tane access modifier var ?
        public > protected > default > private
        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
        v) "protected" ile "default"un farki nedir ?
           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
 */


}
