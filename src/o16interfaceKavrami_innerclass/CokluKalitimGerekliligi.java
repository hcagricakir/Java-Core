package o16interfaceKavrami_innerclass;

import java.util.ArrayList;

public class CokluKalitimGerekliligi {
    public static void main(String[] args) {

        PopSarkicisiOZellikleri popSarkici1 = new Tarkan();
        PopSarkicisiOZellikleri popSarkici2 = new Hadise();

        PopSarkicisiOZellikleri dizi[] = new PopSarkicisiOZellikleri[5];
        dizi[0]=popSarkici1;
        dizi[1]=popSarkici2;

        ArrayList<PopSarkicisiOZellikleri> sarkicilar = new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);

    }
}

abstract class Sarkici {
    abstract void sarkiSoyle();
}

interface ArabeskSarkiciOzellikleri {
    void arabeskOzel();
}

interface PopSarkicisiOZellikleri {
    void popOzel();
    void popOzellik2();
}

class ArabeskSarkici extends Sarkici {
    @Override
    void sarkiSoyle() {
        System.out.println("Arabesk Sarkici sarki söylüyorr");
    }

}

class PopSarkicisi extends Sarkici {

    @Override
    void sarkiSoyle() {
        System.out.println("Pop sarkicii sarki söylüyorr");
    }

}

class Muslum implements ArabeskSarkiciOzellikleri, PopSarkicisiOZellikleri {

    @Override
    public void arabeskOzel() {

    }

    @Override
    public void popOzel() {

    }

    @Override
    public void popOzellik2() {

    }
}
class Tarkan implements ArabeskSarkiciOzellikleri, PopSarkicisiOZellikleri{

    @Override
    public void arabeskOzel() {

    }

    @Override
    public void popOzel() {

    }

    @Override
    public void popOzellik2() {

    }
}

class Hadise implements PopSarkicisiOZellikleri{

    @Override
    public void popOzel() {

    }

    @Override
    public void popOzellik2() {

    }
}
