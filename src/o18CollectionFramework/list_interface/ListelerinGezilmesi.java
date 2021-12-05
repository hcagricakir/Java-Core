package o18CollectionFramework.list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListelerinGezilmesi {

    public static void main(String[] args) {
        ArrayList<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);
        sayilar1.add(4);

        ArrayList<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(4);
        sayilar2.add(5);
        sayilar2.add(6);

        System.out.println(sayilar1);

        for (int sayi: sayilar1) {
            System.out.print(sayi+" ");
        }


        // iki dizideki ortak olan sayilari döngüden çıkar
       //r (int i =0; i<sayilar1.size();i++) {
       //  if (sayilar2.contains(sayilar1.get(i))){
       //      sayilar1.remove(i);
       //  }
       //

        System.out.println("Aynı sayilar çıkarıldıktan sonra: ");


        Iterator<Integer> iter = sayilar1.iterator();
        while (iter.hasNext()){
            if (sayilar2.contains(iter.next())){
                iter.remove();
            }
        }
        System.out.println(sayilar1);

        System.out.println("ListIterator ile listeyi gezelim");
        ListIterator<Integer> listIterator = sayilar2.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("ListIterator ile listeyi sondan başa gezelim");
        ListIterator<Integer> listIteratorSondanBasa = sayilar2.listIterator(sayilar2.size());
        while (listIteratorSondanBasa.hasPrevious()){
            System.out.println((listIteratorSondanBasa.previous()));
        }


    }
}                          
