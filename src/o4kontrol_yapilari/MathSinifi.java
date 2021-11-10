package o4kontrol_yapilari;

public class MathSinifi {
    public static void main(String[] args) {
        System.out.println("pi sayisi: "+ Math.PI);

        System.out.println("Mutlak Değeri : "+ Math.abs(-4));
        System.out.println("4.6 yuvarlanmış değer : "+ Math.ceil(4.6));
        System.out.println("pow : "+ Math.pow(4,2));

        int randomSayi = (int)(Math.random() * 10 + 1);
        System.out.println(randomSayi);
    }
}
