package o5GanelTekrarSorulari1;
import java.util.Scanner;
public class soru3 {
    public static void main(String[] args) {
        //Klavyeden girilen vize ve final notlarınına göre öğrencinin dersi geçip geçmediğini söyleyen
        //bir uygulama yazınız.(Geçme notu : 50, vizenin %40ı, finalin %60ı geçerlidir.)
        Scanner tara = new Scanner(System.in);
        int vize,ffinal;
        vize = tara.nextInt();
        ffinal= tara.nextInt();
        int not = (vize*40)/100 + (ffinal*60)/100;

        if(not>50){
            System.out.println("Geçti");
        }else{
            System.out.println("Kaldı");
        }

    }
}
