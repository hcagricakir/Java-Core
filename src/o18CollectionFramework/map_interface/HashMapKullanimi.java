package o18CollectionFramework.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapKullanimi {

  public static void main(String[] args) {

    HashMap<Integer, String> plakalar = new HashMap<>();
    plakalar.put(1,"adana");
    plakalar.put(34,"istanbuk");
    plakalar.put(32,"istanbukk");
    plakalar.put(35,"istanbukkl");

    HashMap<Integer, String> plakalarYedek = new HashMap<>();
    plakalarYedek.putAll(plakalar);
    System.out.println(plakalarYedek);
    System.out.println(plakalar);
    System.out.println(plakalar.containsKey(34));
    System.out.println(plakalar.containsValue("adana"));

    System.out.println(plakalar.equals(plakalarYedek));

    for(Integer key:plakalar.keySet()){
      System.out.println("keyler : "+key);
    }

    for (Map.Entry< Integer,String > entry: plakalar.entrySet()) {
      System.out.println("key" + entry.getKey()+"value" + entry.getValue());

    }

  }

}
