package o10oopKonseptleri;

public class Inheritance {

    public static void main(String[] args) {
        Dikdortgen d1 = new Dikdortgen(4, 5);
        d1.dikdortgeninOzellikleriniYazdir();
        System.out.println(d1);//tostring override tan dolayı GeometrikSekil{en=4, boy=5} şeklinde yazdırıyor
        GeometrikSekil gs1 = new GeometrikSekil(5, 10);
        System.out.println(gs1);

        Kare k1 = new Kare(10, 10);
        k1.dikdortgeninOzellikleriniYazdir();
    }
}

class GeometrikSekil {

    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
    }

    public GeometrikSekil(int en) {
        this.en = en;
    }

    public GeometrikSekil() {
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void alanHesapla() {
        System.out.println("Alan : " + (getEn() * getBoy()));
    }

    public void cevreHesapla() {
        System.out.println("Cevre : " + (getEn() + getBoy()) * 2);
    }

    @Override
    public String toString() {
        return "GeometrikSekil{" +
                "en=" + en +
                ", boy=" + boy +
                '}';
    }
}

class Dikdortgen extends GeometrikSekil {
    public Dikdortgen(int en, int boy) {
        super(en, boy);
    }

    public void dikdortgeninOzellikleriniYazdir() {
        System.out.println("Dikdortgenin eni : " + getEn() + " Boyu: " + getBoy());
        alanHesapla();
        cevreHesapla();
    }

}

class Kare extends Dikdortgen {

    public Kare(int en, int boy) {
        super(en, boy); //super bir üst sınıfı belirler
    }

}