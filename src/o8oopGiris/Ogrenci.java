package o8oopGiris;

public class Ogrenci {
    private int ogrenciNo;
    private byte sinif;
    private boolean aktif;
    private String isim;

    public void setOgrenciNo(int ogrenciNo){
        this.ogrenciNo=ogrenciNo;
    }
    public int getOgrenciNo(){
        return this.ogrenciNo;
    }

    public byte getSinif() {
        return sinif;
    }

    public void setSinif(byte sinif) {
        this.sinif = sinif;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Ogrenci() {
        System.out.println("Constructor calısiyor");
        aktif = true;
        ogrenciNo = 9999;
        isim = "İsim bilgisi Yok";
        sinif = 127;
    }

    public Ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktif) {
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.isim = isim;
        this.aktif = aktif;
    }

    public Ogrenci(int ogrenciNo, String isim) {
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
    }

    public Ogrenci(String isim) {
        this.isim = isim;
        aktif = true;
    }

    public void dersAl() {
        System.out.println("Öğrenci ders alıyor");
    }

    public void ogrenciBilgileriniYazdir() {
        if (aktif) {
            System.out.println("Adı :" + isim + " Numara :" + ogrenciNo + " Sınıfı :" + sinif);
        } else {
            System.out.println("Öğrenci aktif değil");
        }
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo=" + ogrenciNo +
                ", sinif=" + sinif +
                ", aktif=" + aktif +
                ", isim='" + isim + '\'' +
                '}';
    }
}
