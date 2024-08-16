package Module2;

import java.util.HashSet;

public class Q_68 {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        String[] array = set.toArray(new String[0]);
	        for (String element : array) {
	            System.out.println(element);
	        }
	}

}
