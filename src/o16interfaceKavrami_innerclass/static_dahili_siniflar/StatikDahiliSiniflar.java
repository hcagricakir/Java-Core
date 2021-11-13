package o16interfaceKavrami_innerclass.static_dahili_siniflar;

public class StatikDahiliSiniflar {
    public static void main(String[] args) {

        CerceveSinif cerceveSinif = new CerceveSinif();
        cerceveSinif.nesneDegiskeni =5 ;
        cerceveSinif.metot();
        cerceveSinif.staticMetot();

        CerceveSinif.IcSinif icSinif = new CerceveSinif.IcSinif();
        icSinif.icSinifmetot();
        icSinif.icSinifNesneDegikeni = 5;

        CerceveSinif.IcSinif.icSinifstaticMetot();

    }
}
