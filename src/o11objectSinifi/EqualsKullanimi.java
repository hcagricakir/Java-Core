package o11objectSinifi;

import java.util.Objects;

public class EqualsKullanimi {
    public static void main(String[] args) {

        Kisi k1 = new Kisi(5, "hasan");
        System.out.println(k1);

        Kisi k2 = new Kisi(5, "hasan");
        System.out.println(k2);

        System.out.println("k1 ve k2 eşit mi : "+ k1.equals(k2));

        Calisan calisan = new Calisan(5,"hasan");

        System.out.println("k1 ve calisan eşit mi :"+ k1.equals(calisan));

        System.out.println("k1 hashcode :"+k1.hashCode()+" k2 hashcode :"+k2.hashCode());

        String isim = new String("hasan");
        String isim2 = new String("hasan");
        System.out.println("stringler eşit mi :"+isim.equals(isim2));

    }
}

class Kisi extends Object {
    int id;
    String isim;

    public Kisi(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kisi)) return false;
        Kisi kisi = (Kisi) o;
        return id == kisi.id && isim.equals(kisi.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }
}

class Calisan {
    int id;
    String isim;

    public Calisan(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }
}
