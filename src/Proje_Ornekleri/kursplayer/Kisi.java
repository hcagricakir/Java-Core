package Proje_Ornekleri.kursplayer;

public abstract class Kisi {

  private String isim;
  private String tanitimYazisi;
  private String kullniciAdi;

  public Kisi(String isim, String tanitimYazisi, String kullniciAdi) {
    this.isim = isim;
    this.tanitimYazisi = tanitimYazisi;
    this.kullniciAdi = kullniciAdi;
  }

  public String getIsim() {
    return isim;
  }

  public String getTanitimYazisi() {
    return tanitimYazisi;
  }

  public String getKullniciAdi() {
    return kullniciAdi;
  }

  @Override
  public String toString() {
    return "Kisi{" +
           "isim='" + isim + '\'' +
           ", tanitimYazisi='" + tanitimYazisi + '\'' +
           ", kullniciAdi='" + kullniciAdi + '\'' +
           '}';
  }
}
