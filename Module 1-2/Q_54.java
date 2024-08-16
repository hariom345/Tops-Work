package Module2;

import java.util.ArrayList;

//• Write a Java program to search an element in an array list.
public class Q_54 {
    public static void main(String[] args) {
        ArrayList<String> bike=new ArrayList<>();
        bike.add("splendar");
        bike.add("paltina");
        bike.add("hero");
        bike.add("Bajaj");
        System.out.println( bike.contains("hero"));
    }
}
