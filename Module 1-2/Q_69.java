package Module2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q_69 {
	public static void main(String[] args) {
		  HashSet<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        List<String> list = new ArrayList<>(set);
	        System.out.println(list);
	}

}
