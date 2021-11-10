package o6method_dizi_string;

import java.util.Arrays;

public class DiziArrayKavrami {
    public static void main(String[] args) {
        int sayilar[] = new int[10];
        for (int i = 0; i < 10; i++) {
            sayilar[i] = i;
        }
        System.out.println(Arrays.toString(sayilar));
    }
}
