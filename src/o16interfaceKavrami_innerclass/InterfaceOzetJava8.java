package o16interfaceKavrami_innerclass;

public class InterfaceOzetJava8 {
    public static void main(String[] args) {

        SinifA a = new SinifA();
        a.defaultMetot();

    }
}

interface A {

    void metotA();
    default void defaultMetot(){ //java 8 ile birlikte geldi
        System.out.println("default metot");
    }
    int sayi = 0;  // default olarak static finalder değer atanması şarttır.

    static void staticMetot() {
        System.out.println("statick metotum");
    }
}

class SinifA implements A{

    @Override
    public void metotA() {

    }

    @Override
    public void defaultMetot() {
        System.out.println("ben sinif a içinceki default metottum");
    }
}
