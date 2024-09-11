package Module2;
//Write a Java program to copy one array list into another.
import java.util.ArrayList;

public class Q_56 {
 public static void main(String[] args) {
     ArrayList<String> bike2=new ArrayList<>();
     bike2.add("splendar");
     bike2.add("paltina");
     bike2.add("hero");
     bike2.add("Bajaj");
     ArrayList<String>fruits=new ArrayList<>();
     fruits.add("Mango");
     fruits.add("Grapes");
     fruits.add("Apple");
     fruits.add("Banana");
     bike2.addAll(fruits);
     System.out.println(bike2);
 }
}
