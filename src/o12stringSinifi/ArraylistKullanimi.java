package o12stringSinifi;

import java.util.ArrayList;

public class ArraylistKullanimi {
    public static void main(String[] args) {
/*
        Telefon[] telefonlar = new Telefon[20];
        Telefon tel1 = new Telefon("marka1", 1000);
        Telefon tel2 = new Telefon("marka2", 2000);
        Telefon tel3 = new Telefon("marka3", 3000);

        telefonlar[0] = tel1;
        telefonlar[1] = tel2;
        telefonlar[2] = tel3;

        System.out.println(telefonlar[1]);

        telefonlar = new Telefon[20];

        System.out.println(telefonlar[1]); */

        ArrayList<Telefon> telefonlar = new ArrayList<>();
        Telefon tel1 = new Telefon("marka1", 1000);
        Telefon tel2 = new Telefon("marka2", 2000);
        Telefon tel3 = new Telefon("marka3", 3000);

        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);
        //telefonlar.remove(2);
        System.out.println(telefonlar);
        System.out.println(telefonlar.size());
        listeyiYazir(telefonlar);
        telefonlar.add(tel1);
        telefonlar.add(0,tel3);
        System.out.println("Değişiklerden sonra");
        listeyiYazir(telefonlar);
        System.out.println(telefonlar.contains(tel1));
    }

    private static void listeyiYazir(ArrayList<Telefon> liste) {
        /*for (int i = 0; i <= liste.size() - 1; i++) {
            System.out.println(liste.get(i));
        }*/
        for (Telefon oankiDeger : liste) {
            System.out.println(oankiDeger);
        }
    }
}

class Telefon {
    String model;
    int fiyat;

    public Telefon(String model, int fiyat) {
        this.model = model;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}

/* ArrayList Sınıfının Metotları
ogrenciler.size() --> arraylistte tutulan eleman sayısını verir.
ogrenciler.add(emre) --> ogrenci nesnesi olan emre referansını ekler.
ogrenciler.contains() --> bir elemanın listede olup olmadığını kontrol eder.
ogrenciler.remove(emre) --> elemanı listeden siler.
ogrenciler.get(i) --> i. indeksteki elemanı okur.
ogrenciler.set(index, hasan);--> verilen indekse hasanı yerleştirir.
Elinizde bir dizi varsa bunu listenize aktarabilirsiniz.
Arraylist<String> isimListesi = new Arraylist<>(Arrays.asList(dizi));
*/