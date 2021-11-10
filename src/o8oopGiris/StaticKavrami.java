package o8oopGiris;

public class StaticKavrami {
    public static void main(String[] args) {
        Memur m1 = new Memur();
        m1.setIsim("cagri");
        m1.setMaas(123);

        Memur m2 = new Memur();
        m2.setIsim("cakir");
        m2.setMaas(321);

        m2.bilgileriGoster();

        System.out.println("Nesne sayisi m1:"+ m1.olusturulanMemurNesnesi);
        System.out.println("Nesne sayisi m2 :"+ m2.olusturulanMemurNesnesi);

    }
}

class Memur{

    private String isim;
    private int maas;
    public static int olusturulanMemurNesnesi; //hafızada ayrı biryerde tutuluyor bu sayede her biri için aynı olur.

    public Memur(){
        olusturulanMemurNesnesi ++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if(maas <0){
            maas=0;
        }else{
            this.maas = maas;
        }
        this.maas = maas;
    }

    public void bilgileriGoster(){
        System.out.println("Oluşturulan memur nesnesi: "+olusturulanMemurNesnesi);
    }
}
