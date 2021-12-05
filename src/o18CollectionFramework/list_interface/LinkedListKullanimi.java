package o18CollectionFramework.list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        for (int i=0; i<90000000;i++){
            sayilar1.add((int)(Math.random()*5000000));
        }
        for (int i=0; i<90000000;i++){
            sayilar2.add((int)(Math.random()*5000000));
        }

    }

        public static void linklistiHazirla(LinkedList<Integer> sayilar1){

        }

        public static void siraliEkle(List<Integer> liste){

        }



}
