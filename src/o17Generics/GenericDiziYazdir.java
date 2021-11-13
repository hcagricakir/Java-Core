package o17Generics;

public class GenericDiziYazdir<GelenVeriTuru> {

    public void yazdir(GelenVeriTuru[] dizi) {
        for (GelenVeriTuru temp :
                dizi) {
            System.out.println(temp);
        }
    }
}
