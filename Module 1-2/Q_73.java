package Module2;
//Write a Java program to print all the elements of an Array List using the position of 
//the elements. 

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.GroupLayout.Alignment;

public class Q_73 {
	public static void main(String[] args) {
		ArrayList< String>name=new ArrayList<>();
		name.add("sonu");
		name.add("ramesh");
		name.add("atul");
		name.add("om");
		name.add("monu");
		for(int i=0;i<=name.size();i++) {
		System.out.println("element at position "+i+" is "+name.get(i));
			
		}
	}

}
