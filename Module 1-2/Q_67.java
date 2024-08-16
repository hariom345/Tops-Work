package Module2;

import java.util.ArrayList;

// Write a Java program to join two array lists

public class Q_67 {
	public static void main(String[] args) {
	      // Create two ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        // Join the two ArrayLists
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        // Print the joined ArrayList
        System.out.println(joinedList);
  
		
	}

}
