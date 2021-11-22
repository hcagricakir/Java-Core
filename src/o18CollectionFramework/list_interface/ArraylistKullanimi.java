package o18CollectionFramework.list_interface;

import java.util.ArrayList;

public class ArraylistKullanimi {
    public static void main(String[] args) {

        ArrayList<Integer > sayilar1 = new ArrayList<>();
        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);

        ArrayList<String > sayilar2 = new ArrayList<>(20);
        sayilar2.add("hasan");
        sayilar2.add("hasan2");
        sayilar2.add("hasan3");
        //arraaaylist verilan sayı kadar eleman tutacak sekilde arttırı.
        sayilar2.ensureCapacity(100);
        //arraylis sadece içindeki eleman tutacak şekilde küçültür.
        sayilar2.trimToSize();
        ArrayList<String> isimlerYedek = new ArrayList<>(sayilar2);
        System.out.println(isimlerYedek);

        System.out.println(isimlerYedek.isEmpty());

        isimlerYedek.clear();

        System.out.println(isimlerYedek.isEmpty());
        isimlerYedek.add("hasan");

        System.out.println(isimlerYedek.contains("hasan"));

        String[] isimlerDizisi =  isimlerYedek.toArray(new String[0]);
        System.out.println(isimlerDizisi[0]);
    }
}
