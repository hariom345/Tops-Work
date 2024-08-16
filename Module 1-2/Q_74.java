package Module2;
//Write a Java program to compare two sets and retain elements which are same on 
//both sets.

import java.util.HashSet;
import java.util.Set;

public class Q_74 {
	public static void main(String[] args) {
		 // Create two sets
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Date");

        set1.retainAll(set2);

   
        System.out.println(set1);
	}

}
