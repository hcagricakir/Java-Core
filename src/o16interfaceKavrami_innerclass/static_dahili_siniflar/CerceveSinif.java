package o16interfaceKavrami_innerclass.static_dahili_siniflar;

public class CerceveSinif {

    int nesneDegiskeni;
    static int staticDegisken;

    public void metot() {
    }

    static void staticMetot() {
    }

    static class IcSinif {   //class static ise sadece dışarıda bulunan static lere erişebiliriz.

        int icSinifNesneDegikeni;
        static int icSinifStaticNesneDegikeni;

        public void icSinifmetot() {

        }

        static void icSinifstaticMetot() {
        }
    }
}
