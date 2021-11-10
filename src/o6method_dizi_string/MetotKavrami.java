package o6method_dizi_string;

public class MetotKavrami {
    public static void main(String[] args){

        menuGoster();
        int toplam = sayilariTopla(10,5);
        System.out.println(toplam);
    }

    public static int sayilariTopla(int s1,int s2){
        System.out.println("toplam :"+(s1+s2));
        return s1+s2;
    }
    public static void menuGoster(){
        System.out.println("***** MENU *****");
        System.out.println("1 - İki sayının toplamını bul");
        System.out.println("2 - İki sayının farkı bul");
        System.out.println("3 - İki sayının çarpımını bul");
        System.out.println("4 - İki sayının bölümünü bul");
    }
}
