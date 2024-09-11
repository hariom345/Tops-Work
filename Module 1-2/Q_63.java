package Module2;

import java.util.ArrayList;
import java.util.Collections;

//• Write a Java program to reverse elements in an array list
public class Q_63 {
    public static void main(String[] args) {
        ArrayList<String> bike2=new ArrayList<>();
        bike2.add("splendar");
        bike2.add("paltina");
        bike2.add("hero");
        bike2.add("Bajaj");
        for (int i = bike2.size()-1; i >0 ; i--) {
            System.out.println(bike2.get(i));

        }

    }
}

