package Module2;
//• Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.Iterator;

public class Q_49 {
  public static void main(String[] args) {
      ArrayList<String> name=new ArrayList<>();
      name.add("Rohan");
      name.add("sahil");
      name.add("jai");
      name.add("sundaram");
      name.add("krishana");
      Iterator<String>it= name.listIterator();
      while (it.hasNext()){
          String store= it.next();
          System.out.println("Name "+store);
      }

  }
}

