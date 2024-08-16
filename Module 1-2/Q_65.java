package Module2;
//Write a Java program to compare two array lists.
import java.util.ArrayList;

public class Q_65 {
 public static void main(String[] args) {
     ArrayList<String>fruit1=new ArrayList<>();
     fruit1.add("mango");
     fruit1.add("apple");
     fruit1.add("orange");
     ArrayList<String>fruit2=new ArrayList<>();
     fruit1.add("santara");
     fruit1.add("apple");
     fruit1.add("orange");
     System.out.println(fruit1.equals(fruit2));

 }
}

