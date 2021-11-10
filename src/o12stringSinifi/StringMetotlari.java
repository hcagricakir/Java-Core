package o12stringSinifi;

import o9GenelTekrarSorulari3.Soru1;

public class StringMetotlari {
    public static void main(String[] args) {
        String isim = "hasan";

        System.out.println(isim.length());
        System.out.println(isim.charAt(2));
        System.out.println(isim.toUpperCase());
        System.out.println(isim.concat(" cakir"));
        System.out.println(isim);

        System.out.println(isim.trim());

        String ay = "Mart";
        String ay2 = "mart";

        System.out.println(ay.equals(ay2));//false
        System.out.println(ay.equalsIgnoreCase(ay2));//true

        System.out.println(ay.startsWith("A"));//false
        System.out.println(ay.endsWith("t"));//true

        System.out.println(ay.contains("ar"));//true

        System.out.println(isim.substring(3));
/*
        ay.indexOf();
        ay.lastIndexOf();*/


    }
}
