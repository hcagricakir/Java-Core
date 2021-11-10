package o5GanelTekrarSorulari1;
import java.util.Scanner;
public class soru1 {
    public static void main(String[] args) {
        //Klavyeden girilen 3 sayının ortalamasını alan bir uygulama yazınız
        Scanner tara = new Scanner(System.in);
        int x1,x2,x3;
        x1 = tara.nextInt();
        x2 = tara.nextInt();
        x3 = tara.nextInt();
        System.out.println((x1+x2+x3)/3);
    }
}
