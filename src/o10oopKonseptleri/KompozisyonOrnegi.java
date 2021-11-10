package o10oopKonseptleri;

public class KompozisyonOrnegi {
    public static void main(String[] args) {

        Araba deneme1 = new Araba();
        deneme1.hareketeGec();
        deneme1.dur();
    }
}

class Motor {
    private String isim;
    private int hp;

    public Motor() {
        isim = "BMW";
        hp = 136;
        System.out.println("motor cons çalıştı");
    }

    public void calistir(){
        System.out.println("Motor start");
    }
    public void durdur(){
        System.out.println("Motor stop");
    }
}

class Araba{
    private Motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYılı;

    public Araba() {
        arabaMotoru = new Motor();
        renk = "yeşil";
        marka = "marka";
        uretimYılı = 2001;
    }

    public void hareketeGec(){
        System.out.println("Araba start");
    }
    public void dur(){
        System.out.println("araba stop");
    }

}
