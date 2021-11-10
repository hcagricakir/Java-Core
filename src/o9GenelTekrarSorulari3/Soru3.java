package o9GenelTekrarSorulari3;
//Soru 3
//        Hesap makinesi sınıfı oluşturun.Bu sınıfta 4 işlem yapabilmek için
//        metotlarınız olsun. Bu metotlara istenilen sayıda parametre geçilebilmeli.
//        Bölme işlemi için 0 değerini için gerekli kontrolü yazın.

public class Soru3 {
    public static void main(String[] args) {

        System.out.println("Topla : " + HesapMakinesi.topla(10, 12, 15));
        System.out.println("Cikarma : " + HesapMakinesi.cikarma(13, 2, 2));
        System.out.println("Carpma : " + HesapMakinesi.carpma(10, 10, 10));
        if (HesapMakinesi.bölme(40, 5, 2) != -1) {
            System.out.println("Böl: " + HesapMakinesi.bölme(40, 5, 2));
        } else {
            System.out.println("İşlem Başarısız oldu");
        }


    }
}

class HesapMakinesi {
    public static int topla(int... degerler) {
        int toplam = 0;
        for (int deger : degerler) {
            toplam = toplam + deger;
        }
        return toplam;
    }

    public static int cikarma(int... degerler) {
        int fark = degerler[0];
        for (int i = 1; i < degerler.length; i++) {
            fark = fark - degerler[i];
        }
        return fark;
    }

    public static int carpma(int... degerler) {
        int carpım = 1;
        for (int i = 0; i < degerler.length; i++) {
            carpım = carpım * degerler[i];
        }
        return carpım;
    }

    public static double bölme(int... degerler) {
        int bolum = degerler[0];
        for (int i = 1; i < degerler.length; i++) {
            if (degerler[i] != 0) {
                bolum = bolum / degerler[i];
            } else {
                System.out.println("degerlerden biri 0 hata");
                return -1;
            }
        }
        return bolum;
    }
}
