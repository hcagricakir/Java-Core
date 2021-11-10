package o6method_dizi_string;

public class İkiBoyutluDiziler {
    public static void main(String[] args) {
        //2x3 matris
        int[][] sayilar = new int[2][3];
        sayilar[0][0] = 1;
        sayilar[0][1] = 2;
        sayilar[0][2] = 3;
        sayilar[1][0] = 4;
        sayilar[1][1] = 5;
        sayilar[1][2] = 6;

        int[][] sayilar2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ikiBoyutluDiziBastir(sayilar2);
    }
    public static void ikiBoyutluDiziBastir(int[][] x){
        for (int satir = 0;satir< x.length;satir++){
            for( int sutun=0;sutun< x[satir].length; sutun++){
                System.out.println(satir + ". satırın "+ sutun + ". sütünündaki değer :" + x[satir][sutun]);
            }
        }
    }
}
