package Proje_Ornekleri.kursplayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi{

  private ArrayList<Kurs> katildigiKurslar;
  private LinkedList<Ders>izlenecekDersListesi;

  public LinkedList<Ders> getIzlenecekDersListesi() {
    return izlenecekDersListesi;
  }

  public Ogrenci(String isim, String tanitimYazisi, String kullniciAdi) {
    super(isim, tanitimYazisi, kullniciAdi);
    katildigiKurslar=new ArrayList<>();
    izlenecekDersListesi=new LinkedList<>();
  }
    @Override
    public String toString() {
      return super.toString()+ "Ogrenci{" +
             "katildigiKurslar=" + katildigiKurslar +
             '}';
    }

  public void kursaKatil(Kurs javaKursa) {
    if (javaKursa.kursYayindaKontrol()){
      javaKursa.getKursOgrencileri().add(this);
      katildigiKurslar.add(javaKursa);
      System.out.println(this.getIsim()+" kullancisi "+javaKursa.getKursAdi()+" katildi ");
    }else{
      System.out.println(javaKursa.getKursAdi()+"kursu yayinda değil katılamazsınız");
    }
  }

  public void izlenecekDErsEkle(Ders izlenecekDers){
    boolean dersBulundu = false;
    if (katildigiKurslar.size()>0){
      for (Kurs temp:
      katildigiKurslar) {
       if( temp.getKurstakiDersler().contains(izlenecekDers)) {
         izlenecekDersListesi.add(izlenecekDers);
         System.out.println("izlenecek listesine"+temp.getKursAdi()+" kursunda bulunan "+ izlenecekDers.getDersBaslik()+ " dersi eklendi");
         dersBulundu=true;
         break;
       }
       if (!dersBulundu){
         System.out.println("girilen ders bulunamadı veya yetkisiz erişim");
       }
      }
    }
  }
}
