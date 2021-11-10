package o14televizyonSim;
import java.util.Scanner;

public class o14televizyonSim {
    static Scanner tara = new Scanner(System.in);
    static Televizyon tv;

    public static void main(String[] args) {

        menuGoster();
        boolean cikis = false;

        while (!cikis) {
            System.out.println("Seçiminiz : (Menüyü görmek için 8 i tuşlayınız)");
            int secim = tara.nextInt();
            switch (secim) {

                case 1:
                    tvKurveKanallariOlustur();
                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 7:
                    tvKapat();
                    break;
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor");
                    cikis = true;
                    break;
                default:
                    System.out.println("0 ile 8 arasında bir değer giriniz");
                    break;
            }
        }
    }

    private static void kanalDegistir() {
        if(tv!=null){
            System.out.println("Hangi kanalı açmak istiyorsunuz");
            int acilmasiIstenenKanal = tara.nextInt();
            tv.kanalDegistir(acilmasiIstenenKanal);
        }else {
            System.out.println("Önce tvyi kurmalısınız");
        }
    }

    private static void sesArttir() {
        if(tv!=null){
            tv.sesArttir();
        }else {
            System.out.println("Önce tvyi kurmalısınız");
        }
    }
    private static void sesAzalt() {
        if(tv!=null){
            tv.sesAzalt();
        }else {
            System.out.println("Önce tvyi kurmalısınız");
        }
    }

    private static void tvAc() {
        if (tv != null) {
            tv.tvAc();
        } else {
            System.out.println("Önce tvyi kurmalısınız");
        }
    }

    private static void tvKapat() {
        if (tv != null) {
            tv.tvKapat();
        } else {
            System.out.println("Önce tvyi kurmalısınız");
        }
    }

    private static void tvKurveKanallariOlustur() {
        if (tv == null) {
            tara.nextLine();
            System.out.println("Televizyonun markasını giriniz");
            String marka = tara.nextLine();
            System.out.println("Televizyonun boyutunu gir");
            String boyut = tara.nextLine();
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);
        } else {
            System.out.println(tv);
        }
    }

    private static void menuGoster() {
        System.out.println("***** MENU *****");
        System.out.println("0 -- Çıkış\n" +
                "1 -- Televizyonu Kur\n" +
                "2 -- Televizyonuz Aç\n" +
                "3 -- Sesini Arttır\n" +
                "4 -- Sesi Azalt\n" +
                "5 -- Kanal Değiştir\n" +
                "6 -- Kanal Bilgisini Goster\n" +
                "7 -- Televizyon Kapat\n" +
                "8 -- Menüyü Göster\n");
    }
}

