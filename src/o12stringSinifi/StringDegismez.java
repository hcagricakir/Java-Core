package o12stringSinifi;
//string değişmez immutable bir sınıftır.
public class StringDegismez {
    public static void main(String[] args) {

        String isim = new String("hasan");
        String ad = new String("emre");

        System.out.println(isim==ad); //false dönüyor : heap alanındaki referansları kontrol ediyor.

        System.out.println(isim.equals(ad)); //true dönüyor : string ifadeyi kontrol ediyor

        String abc="abc";
        String def="abc";


        System.out.println(abc == def); // ture dönüyor:
    }
}
