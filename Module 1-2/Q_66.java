package Module2;
import java.util.ArrayList;

public class Q_66 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original list: " + list);

        int index1 = 1;
        int index2 = 3;
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

        System.out.println("Modified list: " + list);
    }
}

