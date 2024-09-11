package Module2;
//Write a Java program to create a new array list, add some colors (string) and print out
//the collection

import java.util.ArrayList;

public class Q_48 {
  public static void main(String[] args) {
      ArrayList<String>color=new ArrayList<>();
      color.add("Red");
      color.add("Green");
      color.add("Blue");
      color.add("yellow");
      for (String  element:color){
          System.out.println(element);
      }

  }
}

