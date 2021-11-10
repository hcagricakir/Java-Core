package o6method_dizi_string;

public class MetotlaraDiziGöndermekveAlmak {
    public static void main(String[] args) {
        int sayilar[] = {1, 2, 3};
        diziGoster(sayilar);
        System.out.println("değer arttırmadan önce");
        diziGoster(sayilar);
        diziDegerleriniBirArttir(sayilar);
        System.out.println("değer arttırdıktan sonra");
        diziGoster(sayilar);
    }

    private static void diziDegerleriniBirArttir(int[] sayilar) {
        sayilar[0]++;
        sayilar[1]++;
        sayilar[2]++;
    }


    private static void diziGoster(int[] sayilar) {

        for (int i : sayilar) {
            System.out.println("eleman :" + i);
        }
    }
}
