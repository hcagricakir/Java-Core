package o4kontrol_yapilari;
import java.util.Scanner;
public class AlistirmaSorulariCevap2 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int sansliSayi = (int) (Math.random() * 99 + 1);
        System.out.println("TAhmin gir :");
        int tahminSayi= tara.nextInt();
        System.out.println("sansli Sayi: "+sansliSayi+" tahminSayi"+ tahminSayi);
        int sansliSayiBirinciBasamak = sansliSayi/10;
        int sansliSayiİkinciBasamak = sansliSayi%10;

        int tahminSayiBirinciBasamak = tahminSayi/10;
        int tahminSayiİkinciBasamak = tahminSayi%10;
        if(sansliSayi == tahminSayi){
            System.out.println("10000 Kazandınız");
        }else if(sansliSayiBirinciBasamak == tahminSayiİkinciBasamak && sansliSayiİkinciBasamak == tahminSayiBirinciBasamak){
            System.out.println("5000 Kazandınız");
        }else if(sansliSayiBirinciBasamak == tahminSayiBirinciBasamak || sansliSayiBirinciBasamak == tahminSayiİkinciBasamak || sansliSayiİkinciBasamak == tahminSayiBirinciBasamak || sansliSayiİkinciBasamak == tahminSayiİkinciBasamak){
            System.out.println("amorti kazandın");
        }
    }
}
