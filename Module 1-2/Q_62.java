package Module2;

import java.util.HashMap;
import java.util.Map;

//• Write a Java program to count the number of key-value (size) mappings in a map.
public class Q_62 {
  public static void main(String[] args) {
	  Map<String, Integer>map=new HashMap<>();
	  map.put("one", 1);
	  map.put("two", 2);
	  map.put("three", 3);
	   int size=map.size();
	   System.out.println("size "+size);
  }
}
