package Module2;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to extract a portion of an array list.
public class Q_64 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Banana");
        List<String>sublist=fruits.subList(1,3);
        System.out.println(sublist);

    }
}

