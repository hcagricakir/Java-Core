package o6method_dizi_string;

import java.util.Arrays;

public class ArraySinifiKullanimi {
    public static void main(String[] args) {
        int sayilar[] = {1, 6, 9, 7, 32, 2, 31};
        System.out.println("Sıralama Öncesi dizi :");
        diziYazdir(sayilar);

        //Arrays.sort(sayilar);
        // Arrays.sort(sayilar,2,5);
        Arrays.parallelSort(sayilar);
        System.out.println("Sıralama Sonrasi dizi");
        diziYazdir(sayilar);

        int sonuc = Arrays.binarySearch(sayilar, 6);
        System.out.println("Sonuc :" + sonuc);

        int sayilar2[] = {1, 6, 9, 7, 32, 2, 31};
        Arrays.sort(sayilar2);
        System.out.println("Array List KArşılaştırma  " + Arrays.equals(sayilar,sayilar2));

        int[] yenidizi = new int[20];
        Arrays.fill(yenidizi,13);
        System.out.println("Yeni Dizi");
        diziYazdir(yenidizi);

    }

    private static void diziYazdir(int[] sayilar) {
        for (int i : sayilar) {
            System.out.print(i + ",");
        }
    }
}
