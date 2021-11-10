package o3operatorler;

public class AlistirmaSorularıCevapları {
    public static void main(String[] args) {
        //cevap 1

        int saniye = 1237;
        int dakika = saniye / 60;
        int kalanSanye = saniye % 60;

        System.out.println("Dakika: "+dakika+" Saniye: "+kalanSanye);

        //cevap 2

        double fahrenheit=100;
        double celcilus = ((fahrenheit-32)*(5.0/9.0));
        System.out.println("Girilen :"+ fahrenheit+ "Celcius: "+celcilus);

        //cevap 3
        int yil = 4100;
        boolean artikYil = (yil %400 ==0) || (yil % 4 == 0 && yil % 100 !=0);
        System.out.println(artikYil);
    }
}
