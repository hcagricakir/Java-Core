package o16interfaceKavrami.icice_siniflar;

public class YaziciSinif {

    private int privateDegisken = 1;
    int defaultDegisken = 2;
    protected int protectedDegisken = 3;
    public int publicDegisken = 4;

    private void privateMetot() {
        StringDiziYazdir nesne = new StringDiziYazdir();
        System.out.println(nesne.privateDegiskenDahili);
    }

    void defaultMetot() {
    }

    protected void protectedMetot() {
    }

    public void publicMetot() {
    }


    class StringDiziYazdir { //inner classs
        private int privateDegiskenDahili = 1;
        public int publicDegiskenDahili = 4;
        void stringDiziYazdir(String[] dizi) {

            for (String temp : dizi) {
                System.out.println(temp);
            }
        }
    }

}
