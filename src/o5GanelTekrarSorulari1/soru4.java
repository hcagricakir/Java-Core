package o5GanelTekrarSorulari1;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        //Sıcak soguk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin
        //etmeye çalışsın. Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
        //Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden
        //sonra bulduğunu belirtelim.
        Scanner tara = new Scanner(System.in);
        int uretilenSayi = (int) (Math.random() * 101);//0 ile 100 arası sayı üretilir 100 dahil.
        int tahmin = -1 ;
        int tahminEtmeSayisi = 0;
        while (tahmin != uretilenSayi){
            System.out.println("Tahmininizi giriniz :");
            tahmin = tara.nextInt();
            tahminEtmeSayisi++;
            if(tahmin == uretilenSayi){
                System.out.println("Tebrikler ! "+tahminEtmeSayisi + " seferde sayıyı buldunuz");
            }else if(tahmin > uretilenSayi){
                System.out.println("Tahmin ettiğiniz sayı yüksek, DÜŞÜRÜN");
            }else{
                System.out.println("Tahmin ettiğiniz sayı çok düşük, YÜKSELTİN");
            }
        }

    }
}
