package Module2;
//Write a Java program to sort a given array list.
import java.util.ArrayList;
//import java.util.Collection
import java.util.Collections;

public class Q_55 {
 public static void main(String[] args) {
     ArrayList<String> bike2=new ArrayList<>();
     bike2.add("splendar");
     bike2.add("paltina");
     bike2.add("hero");
     bike2.add("Bajaj");
     Collections.sort(bike2);
     System.out.println(bike2);
 }
}


