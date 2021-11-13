package Proje_Ornekleri.veteriner_birligi;

import java.util.ArrayList;

public class Veteriner extends Kisi {

    private String mezunOlduguOkul;
    private int calismaSuresi;
    private ArrayList<Musteri> veterinerMusterileri;
    private int musteriSayisi;

    public Veteriner(String isim, String tcKimlik, String mezunOlduguOkul, int calismaSuresi) {
        super(isim, tcKimlik);
        this.mezunOlduguOkul = mezunOlduguOkul;
        this.calismaSuresi = calismaSuresi;
        veterinerMusterileri = new ArrayList<>();
        musteriSayisi = 0;
    }

    public void musteriEkle(Musteri musteri){
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
    }

    public void musterileriListele(){
        for (Musteri temp:
             veterinerMusterileri) {
            temp.kendiniTanit();
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(toString()+"ben bir veterinerim");
    }

    @Override
    public String toString() {
        return super.toString()+" Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calismaSuresi=" + calismaSuresi +
                '}';
    }
}
