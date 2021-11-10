package o3operatorler;

public class ArttırmaAzaltmaOperatorleri {
    public static void main(String[] args) {
        int x1=10;
        int x2=++x1;
        int x3=x1--;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        System.out.println("Sonuc : " + (x1)+(--x2)+(x3));
    }
}
