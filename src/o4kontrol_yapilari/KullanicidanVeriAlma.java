package o4kontrol_yapilari;
import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int girilensayi =tara.nextInt();
        System.out.println(girilensayi);

        double girilendouble= tara.nextDouble();
        System.out.println(girilendouble);
    }
}
