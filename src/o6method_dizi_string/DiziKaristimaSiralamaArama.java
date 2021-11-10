package o6method_dizi_string;

public class DiziKaristimaSiralamaArama {
    public static void main(String[] args) {
        int sayilar[] = {1, 5, 7, 2, 4, 6, 86, -5, 123};
        diziYazdir(sayilar);
        diziKaristir(sayilar);
        System.out.println("Yer Değiştirme İşleminden Sonra Dizi");
        diziYazdir(sayilar);
        selectionSortSiralama(sayilar);
        System.out.println("Selection Sort İleminden Sonra Dizi");
        diziYazdir(sayilar);
        int arananSayininSıraNo = binarySearch(sayilar,123);
        System.out.println("Sıra no :"+arananSayininSıraNo);
    }

    private static void selectionSortSiralama(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            //en küçük elemanın ve indexinin bulunması
            int min = dizi[i];
            int minIndex = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (min > dizi[j]) {
                    min = dizi[j];
                    minIndex = j;
                }
            }
            //eğer gerekli ise değerler yer değiştirir
            if (minIndex != i) {
                dizi[minIndex] = dizi[i];
                dizi[i] = min;
            }

        }
    }

    private static void diziKaristir(int[] dizi) {
        for (int i = dizi.length - 1; 0 < i; i--) {
            int rasgeleIndex = (int) (Math.random() * (i + 1));
            int temp = dizi[i];
            dizi[i] = dizi[rasgeleIndex];
            dizi[rasgeleIndex] = temp;
        }
    }

    public static void diziYazdir(int[] dizi) {
        for (int i : dizi) {
            System.out.println("eleman: " + i);
        }
    }

    public static int binarySearch(int[] dizi, int aranacakEleman) {
        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length - 1;

        while (enDusukIndex >= enYuksekIndex) {
            int ortaIndex = (enDusukIndex + enYuksekIndex) / 2;
            if (aranacakEleman < dizi[ortaIndex]) {
                enYuksekIndex = ortaIndex - 1;
            } else if (aranacakEleman == dizi[ortaIndex]) {
                return ortaIndex;
            } else {
                enDusukIndex = ortaIndex + 1;
            }
        }
        return -enDusukIndex -1;
    }
}
