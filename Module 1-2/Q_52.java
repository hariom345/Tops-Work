package Module2;

import java.util.ArrayList;

//Write a Java program to update specific array element by given element.
public class Q_52 {
    public static void main(String[] args) {
        ArrayList<String>bike=new ArrayList<>();
        bike.add("splendar");
        bike.add("paltina");
        bike.add("hero");
        bike.add("Bajaj");
       bike.set(2,"Ola");
        System.out.println(bike);
    }
}

