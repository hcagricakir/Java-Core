package o5GanelTekrarSorulari1;
import java.util.Scanner;
public class soru2 {
    public static void main(String[] args) {
        //Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız.
        Scanner tara = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz");
        int birinciKenar = tara.nextInt();
        System.out.println("Ikinci kenarı giriniz");
        int ikinciKenar = tara.nextInt();
        System.out.println("Üçüncü kenarı giriniz");
        int ucuncuKenar = tara.nextInt();
        if( (birinciKenar == ikinciKenar) && (birinciKenar == ucuncuKenar)){
            System.out.println("Eşkenar üçgen");
        }else if((birinciKenar != ikinciKenar) && (birinciKenar != ucuncuKenar) && (ikinciKenar != ucuncuKenar)){
            System.out.println("Çeşit kenar üçgen");
        }else{
            System.out.println("İkiz kenar üçgen");
        }

    }
}
