package o16interfaceKavrami_innerclass.member_innerclass_ornek;

public class HesapMakinsei {

    public int carp(int i , int j){

        Carp carpma= new Carp();
        int carpim = carpma.carpma(i,j);
        return carpim;
    }

    public class Topla {
        public int topla(int i, int j) {
            return i + j;
        }
    }

    class Cikar {
        public int cikar(int i, int j) {
            return i - j;
        }
    }

    private class Carp {
        public int carpma(int i, int j) {
            return i * j;
        }
    }

    class Bol {
        public String bolme(int i, int j) {
            if(j==0){
                System.out.println("bölen 0 olamaz");
                return "";
            }else{
                int sonuc = i/j;
                return String.valueOf(sonuc);
            }
        }
    }

}
