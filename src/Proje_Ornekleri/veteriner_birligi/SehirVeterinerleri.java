package Proje_Ornekleri.veteriner_birligi;

import java.util.ArrayList;

public class SehirVeterinerleri {

    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public SehirVeterinerleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler = new ArrayList<>();
        toplamVeterinerSayisi = 0;
    }

    public void sehireVeterinerEkle(Veteriner veteriner) {
        sehirdekiVeterinerler.add(veteriner);
        toplamVeterinerSayisi++;
    }

    public void sehirdekiToplamVeterinerSayisiniBul(){
        System.out.println("toplamVeterinerSayisi :"+ sehirdekiVeterinerler.size());
    }

}
