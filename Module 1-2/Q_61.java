package Module2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//• Write a Java program to associate the specified value with the specified key in a
//Hash Map.
public class Q_61 {
  public static void main(String[] args) {
	  Map<String, Integer>map=new HashMap<>();
	  map.put("one", 1);
	  map.put("two", 2);
	  map.put("three", 3);
	  Collection<Integer> values=map.values();
	  for(Integer value:values) {
		  System.out.println(value);
	  }
  }
}

