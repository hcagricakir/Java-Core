package Proje_Ornekleri.kursplayer;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {
    Ogrenci og1 = new Ogrenci("cagri","tanitimyazisi","cgr");
    Egitmen emre= new Egitmen("emre","tanitim","emr");
    Egitmen deneme= new Egitmen("deneme","tanitim","deneme");

    System.out.println(og1);
    System.out.println(emre);

    Ders ders1=new Ders(1,"giris",3.5);
    Ders ders2=new Ders(2,"giris2",9.2);
    Ders ders3=new Ders(3,"giris3",22.9);
    Ders ders4=new Ders(4,"giris4",15.9);
    Ders ders5=new Ders(5,"giris4",15.9);

    Ders ders6=new Ders(6,"giris4",15.9);
    Ders ders7=new Ders(6,"giris4",15.9);
    Ders ders8=new Ders(6,"giris4",15.9);
    Ders ders9=new Ders(6,"giris4",15.9);
    Ders ders10=new Ders(6,"giris4",15.9);

    Kurs javaKursu=new Kurs("Java",emre);
    javaKursu.kursaDersEkle(ders1);
    javaKursu.kursaDersEkle(ders2);
    javaKursu.kursaDersEkle(ders3);
    javaKursu.kursaDersEkle(ders4);
    javaKursu.kursaDersEkle(ders5);

    javaKursu.kursaEgitmenEkle(deneme);

    javaKursu.kursaEgitmenSil(emre);
    javaKursu.kursaEgitmenSil(deneme);

    Kurs androidKursu = new Kurs("android kursu",emre);

    androidKursu.kursaDersEkle(ders6);
    androidKursu.kursaDersEkle(ders7);
    androidKursu.kursaDersEkle(ders8);
    androidKursu.kursaDersEkle(ders9);
    androidKursu.kursaDersEkle(ders10);

    og1.kursaKatil(javaKursu);
    og1.kursaKatil(androidKursu);

    og1.izlenecekDErsEkle(ders1);
    og1.izlenecekDErsEkle(ders6);

    listeyiOynat(og1.getIzlenecekDersListesi());
  }

  public static void listeyiOynat(LinkedList<Ders> izlenecekDersler){
    ListIterator<Ders> iter = izlenecekDersler.listIterator();
    if (izlenecekDersler.size()==0){
      System.out.println("ders eklenmemiş");
    }else{
      Ders ilkders = iter.next();
      System.out.println("şuan izlenen ders: "+ilkders.getDersBaslik()+"süre :"+ilkders.getDakika());
    }
  }

}
