package Proje_Ornekleri.veteriner_birligi;

import java.util.ArrayList;

public class Musteri extends Kisi{

    private String adres;
    private ArrayList<Hayvan> musteriHayvanlari;


    public Musteri(String isim, String tcKimlik,String adres) {
        super(isim, tcKimlik);
        this.adres = adres;
        musteriHayvanlari = new ArrayList<>();
    }

    public void musteriyeHayvanEkle(Hayvan hayvan){
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan + " "+getIsim()+" musterisine eklendi");
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString()+ "ben bir müşteriyim");
    }

    @Override
    public String toString() {
        return super.toString() + "Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
