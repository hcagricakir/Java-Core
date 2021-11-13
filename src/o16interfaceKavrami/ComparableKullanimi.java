package o16interfaceKavrami;

import java.util.Arrays;

public class ComparableKullanimi {
    public static void main(String[] args) {
        Ogrenci og1 = new Ogrenci(51, "hasan");
        Ogrenci og2 = new Ogrenci(2, "çağrı");
        Ogrenci og3 = new Ogrenci(32, "çakır");

        Ogrenci[] ogrenciler = {og1, og2, og3};

        System.out.println("Dizi sıralanmadan önceki hali :");
        for (Ogrenci temp :
                ogrenciler) {
            System.out.println(temp);
        }
        Arrays.sort(ogrenciler);


        System.out.println("Dizi sıralanmadan sonraki hali :");
        for (Ogrenci temp :
                ogrenciler) {
            System.out.println(temp);
        }
    }
}

class Ogrenci implements Comparable<Ogrenci> {
    int id;
    String ad;

    public Ogrenci(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", ad='" + ad;
    }

    @Override
    public int compareTo(Ogrenci o) {
      /*  if(this.id < o.id){
            return -1;
        }else if(this.id > o.id){
            return 1;

       }else return 0;
    */
        if (this.ad.compareTo(o.ad)< 0){
            return -1;
        }else if(this.ad.compareTo(o.ad) >0){
            return 1;
        }else return 0;
    }
}
