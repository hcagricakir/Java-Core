package o18CollectionFramework.yardimciSiniflar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsYardimciSiniflar {

  public static void main(String[] args) {

    Student student1 = new Student(1,"isim");
    Student student2 = new Student(2,"isim2");
    Student student3 = new Student(3,"isim3");

    ArrayList<Student> ogrenciler = new ArrayList<>();
    ogrenciler.add(student1);
    ogrenciler.add(student2);
    ogrenciler.add(student3);

    Student enBuyukOgrenci = Collections.max(ogrenciler, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        if(o1.isim.compareTo(o2.isim)<0){
          return -1;
        }else if (o2.isim.compareTo(o1.isim)>0){
          return 1;
        }else return 0;
      }
    });

    System.out.println(enBuyukOgrenci);


  }

}
class Student{
  int id;
  String isim;

  public Student(int id, String isim) {
    this.id = id;
    this.isim = isim;
  }

  @Override
  public String toString() {
    return "Student{" +
           "id=" + id +
           ", isim='" + isim + '\'' +
           '}';
  }
}
