package Module2;
// Write a Java program to get a collection view of the values contained in this map

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q_75 {
	public static void main(String[] args) {
		   Map<String, Integer> map = new HashMap<>();
	        map.put("one", 1);
	        map.put("two", 2);
	        map.put("three", 3);
	        Collection<Integer> values = map.values();
	        System.out.println(values);
	}

}
