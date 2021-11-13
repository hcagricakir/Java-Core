package o17Generics;

public class GenericsKavrami {
    public static void main(String[] args) {
        String[] isimler = {"emere","hasan","cagr,"};
        Integer[] sayilar = {1,5,2,3,4,6};
        Character[] karakterler = {'a','b','c'};

        /*StringDiziYazdir.yazdir(isimler);
        İntDiziYazdir.yazdir(sayilar);
        CharDiziYazdir.yazdir(karakterler);*/

        GenericDiziYazdir<String> genericDiziYazdirString = new GenericDiziYazdir<>();
        GenericDiziYazdir<Integer> genericDiziYazdirInt = new GenericDiziYazdir<>();
        GenericDiziYazdir<Character> genericDiziYazdirChar = new GenericDiziYazdir<>();

        genericDiziYazdirString.yazdir(isimler);
        genericDiziYazdirInt.yazdir(sayilar);
        genericDiziYazdirChar.yazdir(karakterler);
    }
}
