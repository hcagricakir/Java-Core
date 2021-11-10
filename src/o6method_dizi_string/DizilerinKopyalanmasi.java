package o6method_dizi_string;

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {

        int anaDizi[] = {1, 2, 3, 4, 5};
        int kopyaDizi[] = new int[anaDizi.length];
        //manuel copy
        for (int i = 0; i < anaDizi.length; i++) {
            kopyaDizi[i] = anaDizi[i];
        }
        //array copy
        int kopyaDizi2[] = new int[anaDizi.length];
        System.arraycopy(anaDizi, 0, kopyaDizi2, 0, anaDizi.length);
        System.out.println("*************************");
        diziYazdir(kopyaDizi2);

        int denemeDizisi[] = new int[anaDizi.length];
        denemeDizisi = kopyaDizi2;
        System.out.println("*************************");
        diziYazdir(denemeDizisi);

    }
    public static void diziYazdir(int[] yazdir){
        for (int sayi : yazdir) {
            System.out.println("KopyaDizi : " + sayi);
        }
    }
}
