package o14televizyonSim;

import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        this.acik = false;
        kanallar = new ArrayList<>();
        this.ses = 10;
        this.aktifKanal = 1;
        kanallarOlustur();
    }

    public void sesArttir() {
        if (ses < 20 && acik) {
            ses++;
            System.out.println("Ses seviyesi : " + ses);
        } else {
            System.out.println("ses maksimumda veya tv kapali");
        }
    }

    public void sesAzalt() {
        if (ses > 0 && acik) {
            ses--;
            System.out.println("Ses seviyesi : " + ses);
        } else {
            System.out.println("ses minumumda veya tv kapali");
        }
    }

    public void tvAc() {
        if (acik == false) {
            acik = true;
            System.out.println("TV açıldı");
        } else {
            System.out.println("TV zaten açık");
        }
    }

    public void tvKapat() {
        if (acik == true) {
            acik = false;
            System.out.println("TV kapatıldı");
        } else {
            System.out.println("TV zaten açık");
        }
    }

    private void kanallarOlustur() {
        HaberKanali cnn = new HaberKanali("CNN", 1, "GenelHaber");
        kanallar.add(cnn);
        HaberKanali xd = new HaberKanali("xd", 3, "Spor haber");
        kanallar.add(xd);
        MuzikKanali dreamTurk = new MuzikKanali("dreamTurk", 2, "yerli");
        kanallar.add(dreamTurk);
        MuzikKanali kralFm = new MuzikKanali("kralFm", 4, "yabanci");
        kanallar.add(kralFm);

    }
    public void kanalDegistir(int acilmasiIstenenKanal){
        if(acik){
            if(acilmasiIstenenKanal != aktifKanal){
                if(acilmasiIstenenKanal<=kanallar.size() && acilmasiIstenenKanal >=0 ){
                    aktifKanal = acilmasiIstenenKanal;
                    System.out.println("Kanal : "+ acilmasiIstenenKanal);
                }else {
                    System.out.println("Geçerli bir kanal numarısı giriniz");
                }
            }else{
                System.out.println("zaten aynı kanaldasınız");
            }
        }else{
            System.out.println("önce tvyi açmalısın");
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Televizyon{" +
                "marka='" + marka + '\'' +
                ", boyut='" + boyut + '\'' +
                '}' + "olan tv oluşturuldu";
    }
}


