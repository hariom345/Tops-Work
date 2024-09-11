package Module2;

import java.util.ArrayList;

// Write a Java program to insert an element into the array list at the first position.
public class Q_50 {
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Dragon fruit");
        //inserting at the first position
        fruits.add(0,"Guvava");
        System.out.println(fruits);


    }
}
