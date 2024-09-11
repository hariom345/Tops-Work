package Module2;

import java.util.HashMap;
import java.util.Map;

public class Q_70 {
public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    if (map.isEmpty()) {
        System.out.println("The map is empty");
    } else {
        System.out.println("The map is not empty");
    }
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);
    if (map.isEmpty()) {
        System.out.println("The map is empty");
    } else {
        System.out.println("The map is not empty");
    }
}
}
