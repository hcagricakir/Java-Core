package o16interfaceKavrami_innerclass.icice_siniflar;

public class NestedClassKullanimi {
    public static void main(String[] args) {

        String[] sehirler = {"ankara", "bursa", "izmir"};

        //YaziciSinif.StringDiziYazdir nesne = new YaziciSinif().new StringDiziYazdir();
        // nesne.stringDiziYazdir(sehirler);


        YaziciSinif yaziciSinif = new YaziciSinif();
        YaziciSinif.StringDiziYazdir stringDiziYazdir = yaziciSinif.new StringDiziYazdir();
        stringDiziYazdir.stringDiziYazdir(sehirler);


        YaziciSinif.class1.class2.class3 nesne = new YaziciSinif.class1.class2.class3();
        nesne.metotC();
        YaziciSinif.class1.class2 nesne2 = new YaziciSinif.class1.class2();

    }
}
