package o5GanelTekrarSorulari1;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        //Kullanıcıdan sürekli olarak sayı alan ve de kullanıcı 0a bastığında girdiği sayıların
        //çarpımını sonuç olarak gösteren programı yazınız
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir değer giriniz, çıkmak için 0 tuşlayınız");
        int kullaniciDegeri = tara.nextInt();
        int carpimSonucu = 1;
        boolean hemenCikildiMi = true;
        while (kullaniciDegeri != 0){
            carpimSonucu = carpimSonucu * kullaniciDegeri;
            System.out.println("Bir değer giriniz, çıkmak için 0 tuşlayınız");
            kullaniciDegeri = tara.nextInt();
            hemenCikildiMi = false;
        }
        if(hemenCikildiMi){
            System.out.println("Uygulamadan hemen çıktınız");
        }else{
            System.out.println("Girdiğiniz sayıların çarpımı : " + carpimSonucu);
        }

    }
}
