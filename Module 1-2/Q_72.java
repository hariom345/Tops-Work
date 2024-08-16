package Module2;

import java.util.ArrayList;
//Write a Java program to replace the second element of an Array List with the 
//specified element

public class Q_72 {
	public static void main(String[] args) {
		ArrayList< String>name=new ArrayList<>();
		name.add("sonu");
		name.add("ramesh");
		name.add("atul");
		name.add("om");
		name.add("monu");
		System.out.println(name);
		name.set(1, "pankaj");
		System.out.println("after replacing "+name);
	}

}
