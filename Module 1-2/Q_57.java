package Module2;

import java.util.ArrayList;
import java.util.Collections;
// Write a Java program to shuffle elements in an array list
public class Q_57 {
    public static void main(String[] args) {
        ArrayList<String> bike=new ArrayList<>();
        bike.add("splendar");
        bike.add("paltina");
        bike.add("hero");
        bike.add("Bajaj");
        Collections.shuffle(bike);
        System.out.println(bike);
    }
}

