package Module2;

import java.util.Collections;
import java.util.HashSet;

// 58.Write a Java program to append the specified element to the end of a hash set
public class Q_58 {
    public static void main(String[] args) {
        HashSet<String>course=new HashSet<>();
        course.add("Python");
        course.add("Java");
        course.add("Dart");
        course.add("C++");
        System.out.println("before appeding\t"+course);
        //appending the ellement at the end of the set
        course.add("javascript");
        System.out.println(course);
    }
}
