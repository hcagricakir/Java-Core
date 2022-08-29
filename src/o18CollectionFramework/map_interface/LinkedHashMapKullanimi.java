package o18CollectionFramework.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapKullanimi {

  public static void main(String[] args) {
    LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

    linkedHashMap.put("cagri",1);
    linkedHashMap.put("cagri2",2);
    linkedHashMap.put("cagri3",3);

    System.out.println(linkedHashMap);

  }

}
