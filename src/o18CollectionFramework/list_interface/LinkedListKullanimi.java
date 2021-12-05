package o18CollectionFramework.list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
// eleman eklemek ve çıkarmak daha hızlı
// fakat listeyi gezmek daha verimsiz

public class LinkedListKullanimi {
    public static void main(String[] args) {
        //  LinkedList<Integer> sayilar1 = new LinkedList<>();
        //  sayilar1.add(1);
        //  sayilar1.add(2);
        //  sayilar1.add(4);
        //  sayilar1.add(2,3);
        //
        //  System.out.println(sayilar1);
        //
        //  ListIterator<Integer> iter =sayilar1.listIterator();
        //  while (iter.hasNext()){
        //      System.out.println(iter.next());
        //  }
        LinkedList<Integer> sayilar1 = new LinkedList<>();
        ArrayList<Integer> sayilar2 = new ArrayList<>();

        linklistiHazirla(sayilar1);
        System.out.println(sayilar1);
        arraylistiHazilra(sayilar2);
        System.out.println(sayilar2);


    }

    private static void arraylistiHazilra(ArrayList<Integer> sayilar2) {
        for (int i = 0; i < 9; i++) {
            int yeniEklenecekEleman = (int) (Math.random() * 5);
            siraliEkle(sayilar2, yeniEklenecekEleman);
        }
    }

    public static void linklistiHazirla(LinkedList<Integer> sayilar1) {
        for (int i = 0; i < 9; i++) {
            int yeniEklenecekEleman = (int) (Math.random() * 5);
            siraliEkle(sayilar1, yeniEklenecekEleman);
        }
    }

    public static boolean siraliEkle(List<Integer> liste, int yeniEklenecekEleman) {

        ListIterator<Integer> iter = liste.listIterator();
        while (iter.hasNext()) {

            int karsilastirmaSonucu = iter.next().compareTo(yeniEklenecekEleman);
            if (karsilastirmaSonucu == 0) {
                iter.add(yeniEklenecekEleman);
                return true;
            } else if (karsilastirmaSonucu > 0) {
                iter.previous();
                iter.add(yeniEklenecekEleman);
                return true;
            } else {
            }
        }
        iter.add(yeniEklenecekEleman);
        return true;
    }


}
