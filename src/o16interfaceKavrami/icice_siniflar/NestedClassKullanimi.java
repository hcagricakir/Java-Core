package o16interfaceKavrami.icice_siniflar;

public class NestedClassKullanimi {
    public static void main(String[] args) {

        String[] sehirler = {"ankara", "bursa","izmir"};

        //YaziciSinif.StringDiziYazdir nesne = new YaziciSinif().new StringDiziYazdir();
        // nesne.stringDiziYazdir(sehirler);


        YaziciSinif yaziciSinif = new YaziciSinif();
        YaziciSinif.StringDiziYazdir stringDiziYazdir = yaziciSinif.new StringDiziYazdir();
       stringDiziYazdir.stringDiziYazdir(sehirler);

    }
}
