package o9GenelTekrarSorulari3;

//Soru 1
//        CemberDaire isimli sınıf oluşturun. Bu sınıfın yarıçap alan kurucusu
//        olmalı.Ayrıca cevre ve alanını hesaplayan metotlar olmalı.
public class Soru1 {
    public static void main(String[] args) {

        CemberDaire cember1=new CemberDaire(5);
        System.out.println("Yarıcapı 5 olan çemberin çevresi: "+cember1.cevreBul());
        System.out.println("Yarıcapı 5 olan çemberin alanı: "+cember1.alanBul());

    }
}

class CemberDaire {
    private int yariCap;
    public final static double PI = 3.14;

    public CemberDaire(int r) {
        this.yariCap = r;
    }

    public double cevreBul() {
        return 2 * PI * yariCap;
    }
    public double alanBul(){
        return (double) (PI * Math.pow(yariCap,2));
    }
}
