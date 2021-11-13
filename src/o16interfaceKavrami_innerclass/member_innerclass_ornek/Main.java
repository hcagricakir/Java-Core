package o16interfaceKavrami_innerclass.member_innerclass_ornek;

public class Main {

    public static void main(String[] args) {
        HesapMakinsei hm = new HesapMakinsei();

        HesapMakinsei.Topla toplayici = hm.new Topla();
        int toplam = toplayici.topla(5, 6);
        System.out.println("Toplam: " + toplam);

        HesapMakinsei.Cikar cikarici = hm.new Cikar();
        int cikarilmis = cikarici.cikar(5, 6);
        System.out.println("Cikarim: " + cikarilmis);

        HesapMakinsei.Bol bölücü = hm.new Bol();
        String bölüm = bölücü.bolme(5, 6);
        System.out.println("bölücü :" + bölüm);
/*
        HesapMakinsei.Carp carpici = hm.new Carp();
        int carpim = carpici.carpma(5, 6);
        System.out.println("Carpim :" + carpim); */

        int carpim = hm.carp(6,7);
        System.out.println("Carpim :"+carpim);
    }
}
