package Proje_Ornekleri.veteriner_birligi;

public class Main {
    public static void main(String[] args) {

        ilkNesneleriOlustur();


    }

    private static void ilkNesneleriOlustur() {
        Kedi kedi = new Kedi("01.01.2014",true,"Van KEdisi");
        Kedi kedi2 = new Kedi("02.02.2012",true,"Siyam Kedisi");
        Kedi kedi3 = new Kedi("13.03.1914",true,"Tekir KEdisi");

        Kopek kopek = new Kopek("01.05.1212",true,11,"golden");
        Kopek kopek2 = new Kopek("03.05.1212",true,12,"cocker");
        Kopek kopek3 = new Kopek("04.05.1212",true,13,"sokak");

        Musteri m1 = new Musteri("hasan","12321321","adresadres");
        m1.musteriyeHayvanEkle(kedi);
        m1.musteriyeHayvanEkle(kopek);

        Musteri m2 = new Musteri("ali","12321321","adresadres");
        m2.musteriyeHayvanEkle(kedi2);
        m2.musteriyeHayvanEkle(kopek2);

        Musteri m3 = new Musteri("muratnan","12321321","adresadres");
        m3.musteriyeHayvanEkle(kedi3);
        m3.musteriyeHayvanEkle(kopek3);

        Veteriner v1 = new Veteriner("ayse1","12321","okul1",123);
        v1.musteriEkle(m1);

        Veteriner v2 = new Veteriner("ayse2","123212","okul2",1234);
        v2.musteriEkle(m2);

        Veteriner v3 = new Veteriner("ayse3","12322131","okul3",1234);
        v3.musteriEkle(m2);


        v1.musterileriListele();

        SehirVeterinerleri ankara = new SehirVeterinerleri("ankara");
        ankara.sehireVeterinerEkle(v1);
        ankara.sehireVeterinerEkle(v2);

        SehirVeterinerleri izmir = new SehirVeterinerleri("izmir");
        izmir.sehireVeterinerEkle(v3);

        ankara.sehirdekiToplamVeterinerSayisiniBul();
        izmir.sehirdekiToplamVeterinerSayisiniBul();


        System.out.println("Yonetim Paneli Başladı");
        YonetimPaneli<Hayvan> hayvanYonetimPaneli = new YonetimPaneli<>();
        hayvanYonetimPaneli.bilgileriGoster(kedi);

        YonetimPaneli<Musteri> musteriYonetimPaneli = new YonetimPaneli<>();
        musteriYonetimPaneli.bilgileriGoster(m1);
    }

}
