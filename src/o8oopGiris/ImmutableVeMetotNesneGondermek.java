package o8oopGiris;

public class ImmutableVeMetotNesneGondermek {
    public static void main(String[] args) {

        //String[] ureticiFirmalar = {"1","2","3"};
        Bilgisayar b1 = new Bilgisayar(8, 16, new String[]{"1", "2", "3"});
        bilgisayariYazdir(b1);

        String[] ureticiler = b1.getUreticiFirmalar();
        ureticiler[0] = "degistirdik";
        bilgisayariYazdir(b1);

    }

    public static void bilgisayariYazdir(Bilgisayar yazdiralacakPc) {
        System.out.println("cekirdek sayisi: " + yazdiralacakPc.getCekirdekSayisi() + "ram miktari : " + yazdiralacakPc.getRamBoyutu()
                + "ureticiFirmalar :" + yazdiralacakPc.getUreticiFirmalar()[0]);
    }
}

class Bilgisayar {

    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalar;

    public Bilgisayar(int cSayisi, int ramBoyutu, String[] ureticiFirmaAdlari) {
        this.cekirdekSayisi = cSayisi;
        this.ramBoyutu = ramBoyutu;
        this.ureticiFirmalar = ureticiFirmaAdlari;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRamBoyutu() {
        return ramBoyutu;
    }

    public String[] getUreticiFirmalar() {
        String[] tempFirmaİsimleri = new String[ureticiFirmalar.length];
        for (int i = 0; i < tempFirmaİsimleri.length; i++) {
            tempFirmaİsimleri[i] = ureticiFirmalar[i];
        }
        return tempFirmaİsimleri;
    }


}
