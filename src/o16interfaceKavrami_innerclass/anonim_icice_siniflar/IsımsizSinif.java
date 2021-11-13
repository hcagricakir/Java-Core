package o16interfaceKavrami_innerclass.anonim_icice_siniflar;

public class IsımsizSinif {
    public static void main(String[] args) {

        Hesaplayici hesaplayici1 = new Hesaplayici() {  // isimsiz sinif
            @Override
            public void topla(int s1, int s2) {
                System.out.println("İki sayinın toplamı");
                super.topla(s1, s2);
            }
        };
        Hesaplayici hesaplayici = new Hesaplayici();
        hesaplayici.topla(4, 2);
        hesaplayici1.topla(2, 2);

    /*
        YeniHesaplayici yeniHesaplayici = new YeniHesaplayici();
        yeniHesaplayici.topla(4,2);*/

        Canli canli =new Canli() {  //isimsiz sinif 2ç kullanım abstracktan nesne oluşturmak için kullanılabilir.
            @Override
            void adiniSoyle() {

            }
        };
        canli.selamVer();


        Yazdir yazdir = new Yazdir() {
            @Override
            public void yazdir() {
                System.out.println("ananim innerclass interface kullanimi");
            }
        };
        yazdir.yazdir();
    }
}

interface Yazdir{
    void yazdir();
}

abstract class Canli{
    abstract void adiniSoyle();
    void selamVer(){
        System.out.println("merhaba");
    }
}

class YeniHesaplayici extends Hesaplayici {
    @Override
    public void topla(int s1, int s2) {
        System.out.println("İki sayını toplamı");
        super.topla(s1, s2);
    }
}
