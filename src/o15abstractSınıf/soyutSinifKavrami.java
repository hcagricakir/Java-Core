package o15abstractSınıf;

public class soyutSinifKavrami {
    public static void main(String[] args) {

        GeometrikSekil kare = new Kare(5);
        kare.cevreHesapla();
        kare.alanHesapla();
        ((Kare) kare).adiniSoyle();  //down casting yaparak ulaşabilek mümkün.

        System.out.println("************************");

        Dikdortgen dikdortgen = new Dikdortgen(10,2);
        dikdortgen.alanHesapla();
        dikdortgen.cevreHesapla();
        dikdortgen.adiniSoyle();
        System.out.println("************************");

        GeometrikSekil daire = new Daire(5);
        daire.alanHesapla();
        daire.cevreHesapla();
        ((Daire) daire).adiniSoyle();

        alanlariKarsilastir(kare,dikdortgen);
    }

    //public static void alanlariKarsilastir(Kare k1, Kare k2){} klasik kullanım her ikisi için farklı
    // methodlar tanımlamamız gerekir örn: kare dikdörtgen, kare daire, kodu uzatır gereksizdir. Polymorphisim kullanılmalıdı
    public static void alanlariKarsilastir(GeometrikSekil gs1, GeometrikSekil gs2){ //burada ne gelirse gelsin işlemimiz çalışacaktır.
        if(gs1.getHesaplananAlan()>gs2.getHesaplananAlan()){
            System.out.println("gs1 alani > gs2 alani");
        }else {
            System.out.println("gs2 alani > gs1 alanindan");
        }
    }
}

abstract class GeometrikSekil {

    private int birinciKenar;
    private int hesaplananAlan;

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }
}

class Kare extends GeometrikSekil {

    public Kare(int kenar) {
        this.setBirinciKenar(kenar);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Karenin çevresi : " + getBirinciKenar() * 4);
    }

    @Override
    public void alanHesapla() {
        System.out.println("Karenin alanı : " + getBirinciKenar() * getBirinciKenar());

    }

    public void adiniSoyle(){
        System.out.println("ben bir kare nesnesiyim");
    }
}

class Dikdortgen extends GeometrikSekil {

    public Dikdortgen(int kenar, int ikinciKenar) {
        this.setBirinciKenar(kenar);
        this.ikinciKenar = ikinciKenar;
    }

    private int ikinciKenar;

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdortgenin çevresi : " + 2 * (getBirinciKenar() + ikinciKenar));

    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar() * ikinciKenar);
        System.out.println("Dikdorgenin alanı : " + getHesaplananAlan());
    }
    public void adiniSoyle(){
        System.out.println("ben dikdörgenim");
    }
}

class Daire extends GeometrikSekil {
    //birinci kenari yarı çap olarak düşünüyoruz.

    public Daire(int yaricap) {
        setBirinciKenar(yaricap);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dairenin çevresi : " + 2 * 3.14 * getBirinciKenar());

    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan((int) (3.14 * getBirinciKenar() * getBirinciKenar()));
        System.out.println("Dairenin alanı : " + getHesaplananAlan() );

    }

    public void adiniSoyle(){
        System.out.println("ben bir daireyimmm");
    }
}
