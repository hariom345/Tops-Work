package Module2;

import java.net.Socket;
import java.util.ArrayList;

//Write a Java program to increase the size of an array list

public class Q_71 {
	public static void main(String[] args) {
		ArrayList< String>name=new ArrayList<>();
		name.add("sonu");
		name.add("ramesh");
		name.add("atul");
		name.add("om");
		name.add("monu");
		System.out.println("size\t"+name.size());
		name.ensureCapacity(7);
		name.add("rahul");
		name.add("modiji");
		System.out.println("updated size of name is\t"+name.size());
		
	}

}
