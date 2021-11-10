package o6method_dizi_string;

public class MetotOverloading {
    public static void main(String[] args) {
    int x=5,y=6;
    double a=5.5,b=6.6;

        System.out.println(sayilariTopla(x,y));
        System.out.println(sayilariTopla(a,b));
    }

    private static int sayilariTopla(int x, int y) {
        return x+y;
    }
    private static double sayilariTopla(double x, double y) {
        return x+y;
    }
}
