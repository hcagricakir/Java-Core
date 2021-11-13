package o17Generics;

public class GenericMetotKavrami {
    public static void main(String[] args) {
        String[] isimler = {"emere", "hasan", "cagri"};
        Integer[] sayilar = {1, 5, 2, 3, 4, 6};
        Character[] karakterler = {'a', 'b', 'c'};

       /* stringDiziYazdir(isimler);
        intDiziYazdir(sayilar);
        charDiziYazdir(karakterler);

        diziYazdir(isimler);
        diziYazdir(sayilar);
        diziYazdir(karakterler);
        */
        //genericYazdir(isimler);
        genericYazdir(sayilar);
        //genericYazdir(karakterler);
    }

    public static <Genel extends Number> void genericYazdir(Genel[] dizi){
        for (Genel temp :
                dizi) {
            System.out.print(temp.intValue());
        }
    }
    public static void diziYazdir(Object[] dizi) {
        for (Object temp :
                dizi) {
            System.out.println(temp);
        }
    }

    public static void stringDiziYazdir(String[] dizi) {
        for (String temp :
                dizi) {
            System.out.println(temp);
        }
    }

    public static void intDiziYazdir(Integer[] sayilar) {
        for (Integer temp :
                sayilar) {
            System.out.println(temp);
        }
    }

    public static void charDiziYazdir(Character[] chare) {
        for (Character temp :
                chare) {
            System.out.println(temp);
        }
    }
}
