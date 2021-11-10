package o10oopKonseptleri;

public class Polymoorphism {
    public static void main(String[] args) {

        Hayvan h1 = new Hayvan();
        Kopek kopek1 = new Kopek("golden");
        Kedi kedi1 = new Kedi("van");

        adiniSoyle(h1);
        adiniSoyle(kedi1);
        adiniSoyle(kopek1);

    }

    public static void adiniSoyle(Hayvan k){
        k.adiniSoyle();
    }
}

class Hayvan {
    private int ayaksayisi;

    public int getAyaksayisi() {
        return ayaksayisi;
    }

    public void setAyaksayisi(int ayaksayisi) {
        this.ayaksayisi = ayaksayisi;
    }

    public void adiniSoyle() {
        System.out.println("ben hayvan sınıfı nesnesiyim");
    }
}

class Kopek extends Hayvan {
    private String tur;

    public Kopek(String tur) {
        setAyaksayisi(4);
        setTur(tur);
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir köpek nesnesiyimmm");
    }
}

class Kedi extends Hayvan {

    private String cinsi;

    public Kedi(String cinsi) {
        setAyaksayisi(4);
        setCinsi(cinsi);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("BEn bir kedi nesnesiyimm");
    }
}