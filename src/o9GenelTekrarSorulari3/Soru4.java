package o9GenelTekrarSorulari3;
//Soru 4
//        Bir banka hesabı için sınıf tasarlayın. Bu sınıfta hesabın kime ait oldugunu
//        tutan hesapNo, hesaptakiPara, para yatirma+ ve çekme metotları+ olsun.
//        Ayrıca bu hesaplarda olan tüm parayı, açılan hesap sayısını, yapılan toplam
//        paracekme ve para yatırma sayısını gösteren bir metot++ ve iki hesabı para
//        değişkenine göre birbiriyle kıyaslayacak metot bulunmalı.

public class Soru4 {
    public static void main(String[] args) {
        BankaHesabı deneme1 = new BankaHesabı(1, 1000);
        deneme1.hesapBilgisiGoster();
        deneme1.yatirma(100);
        deneme1.hesapBilgisiGoster();
        deneme1.çekme(50);
        deneme1.hesapBilgisiGoster();
        BankaHesabı deneme2 = new BankaHesabı(2,0);
        deneme2.çekme(100);

        deneme1.kıyaslama(deneme2);
        BankaHesabı deneme3 = new BankaHesabı(3,1050);
        deneme1.kıyaslama(deneme3);

        BankaHesabı.bankaOzetGoster();
    }
}

class BankaHesabı {
    private int hesapNo;
    private int hesaptakiPara;
    private static int tumBankaBakiyesi = 0;
    private static int tumHesapSayisi = 0;
    private static int operasyonSayisi = 0;


    public BankaHesabı(int hesapNo, int hesaptakiPara) {
        this.hesapNo = hesapNo;
        this.hesaptakiPara = hesaptakiPara;
        tumBankaBakiyesi += hesaptakiPara;
        tumHesapSayisi++;
    }

    public void yatirma(int x) {
        this.hesaptakiPara = this.hesaptakiPara + x;
        tumBankaBakiyesi += x;
        operasyonSayisi++;
    }

    public void çekme(int x) {
        if (this.hesaptakiPara >= x) {
            this.hesaptakiPara = this.hesaptakiPara - x;
            tumBankaBakiyesi -= x;
            operasyonSayisi++;
        } else {
            System.out.println("Yeterli para yok malesef!!");
        }
    }

    public void kıyaslama(BankaHesabı kiyaslanacakHesap){
        if(this.hesaptakiPara < kiyaslanacakHesap.hesaptakiPara){
            System.out.println(kiyaslanacakHesap.hesapNo+" nolu hesapta daha fazla para var");
        }else if(this.hesaptakiPara == kiyaslanacakHesap.hesaptakiPara){
            System.out.println("hesaplardaki paralar eşittir!!!");
        } else{
            System.out.println(this.hesapNo+" nolu hesapta daha fazla para var");
        }
    }

    public void hesapBilgisiGoster() {
        System.out.println("HesapNo :" + hesapNo + " Hesaptaki Para :" + hesaptakiPara);
    }

    public static void bankaOzetGoster() {
        System.out.println("Bankadaki hesap sayısı : " + tumHesapSayisi);
        System.out.println("Bankadaki bakiye  : " + tumBankaBakiyesi);
        System.out.println("Bankadaki operasyon sayısı : " + operasyonSayisi);

    }
}
