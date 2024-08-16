package Module2;


import java.util.ArrayList;

//write a Java program to remove the third element from an array list.
public class Q_53 {
    public static void main(String[] args) {
        ArrayList<String> bike=new ArrayList<>();
        bike.add("splendar");
        bike.add("paltina");
        bike.add("hero");
        bike.add("Bajaj");
      bike.remove(2);
        System.out.println(bike);

    }
}

