package o6method_dizi_string;

public class GelismisForDongusu {
    public static void main(String[] args) {
        int[] sayilar = {1, 3, 5, 7, 9, 0};
        String isimler[] = {"emre", "hasan", "cagri"};

        diziYazdir(isimler);
        diziYazdir(sayilar);

    }

    public static void diziYazdir(String dizi[]) {
        for (String s : dizi) {
            System.out.println("for each isim: " + s);
        }
    }

    public static void diziYazdir(int dizi[]) {
        for (int o : dizi) {
            System.out.println("for each eleman : " + o);
        }
    }
}

