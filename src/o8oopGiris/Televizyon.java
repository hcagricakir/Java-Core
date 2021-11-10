package o8oopGiris;

public class Televizyon {
    private int kanal;
    private int sesSeviyesi;
    private boolean acik;

    public void ac() {
        if (!acik) {
            System.out.println("Tv Aciliyor");
            acik = true;
        } else {
            System.out.println("Tv zaten açık");
        }
    }

    public void kapat() {
        if (acik) {
            System.out.println("Tv Kapanıyor");
            acik = false;
        } else {
            System.out.println("Tv zaten kapali");
        }
    }


    public void setKanal(int yeniKanal) {
        if (acik && yeniKanal > 0 && yeniKanal < 500) {
            kanal = yeniKanal;
        } else {
            System.out.println("tv kapali veya yanlış kanal değeri");
        }
    }

    public int getKanal() {
        return kanal;
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi) {
        if (acik && sesSeviyesi > 0 && sesSeviyesi < 20){
            this.sesSeviyesi = sesSeviyesi;
        }else{
            this.sesSeviyesi = 1;
        }

    }

    public void goster() {
        System.out.println("Tv acik :" + acik + " Kanal :" + kanal + " Ses seviyesi :" + sesSeviyesi);
    }
}
