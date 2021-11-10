package o4kontrol_yapilari;
import java.util.Scanner;
public class AlistirmaSorulariCevap1 {
    public static void main(String[] args) {
        //kullanıcıdan aldığınız kritere göre vke hesaplama vke = kilo / (boy/100)karesi
        int boy;
        int kilo;
        Scanner tara = new Scanner(System.in);
        boy = tara.nextInt();
        kilo = tara.nextInt();
        double vke;
        vke = (double) ((kilo) / Math.sqrt(boy/100));
        System.out.println(boy+" "+kilo+ "vke: "+vke);


    }
}
