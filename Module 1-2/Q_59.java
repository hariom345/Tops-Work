package Module2;

import java.util.HashSet;
import java.util.Iterator;

//59• Write a Java program to iterate through all elements in a hash list.
public class Q_59 {
    public static void main(String[] args) {
        HashSet<String>course=new HashSet<>();
        course.add("Python");
        course.add("Java");
        course.add("Dart");
        course.add("C++");
        Iterator<String>strore=course.iterator();
        while(strore.hasNext()){
            String s1=strore.next();
            System.out.println(s1);

        }
    }
}

