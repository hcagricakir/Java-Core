package o13genelTekrarSorulari;
/*
import o8oopGiris.Ogrenci;

import java.util.ArrayList;

public class Soru1 {


    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        Ogrenci ogr1 = new Ogrenci("emre");
        Ogrenci ogr2 = new Ogrenci(10,"emre");
        Ogrenci ogr3 = new Ogrenci(11,"emre");
        Ogrenci ogr4 = new Ogrenci(12,"emre");
        myStack.push(ogr1);
        myStack.push(ogr2);
        myStack.push(ogr3);
        myStack.push(ogr4);
        myStack.yazdir();
        myStack.pop();
        System.out.println("eleman var :" + myStack.elemanSayisi());
        myStack.yazdir();
        System.out.println("bosmu ? :"+myStack.bosMu());
        System.out.println("son elaman :"+myStack.elemanGoster());
    }
}

class MyStack {
    private ArrayList<Object> liste = new ArrayList<>();

    public MyStack() {
        liste = new ArrayList<>();
    }

    public int elemanSayisi() {
        return liste.size();
    }

    public boolean bosMu() {
        return liste.isEmpty();
    }

    public Object elemanGoster() {
        return liste.get(elemanSayisi() - 1);
    }

    public Object pop(){
        Object geriyeDondurulecekEleman = liste.get(elemanSayisi() - 1);
        liste.remove(elemanGoster());
        return geriyeDondurulecekEleman;
    }

    public void push(Object eklenecekEleman){
        liste.add(eklenecekEleman);
    }

    public void yazdir(){
        System.out.println("******************* YIGIN İÇERİĞİ ************");
                for(int i = 0; i<liste.size();i++){
            System.out.println(i+" indekste :" + liste.get(i));
        }
    }
}
*/