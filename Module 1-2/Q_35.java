package Module2;

import java.net.Socket;
import java.util.Scanner;

/*
ake two numbers from the user and perform the division operation and handle 
Arithmetic Exception. O/P- Enter two numbers: 10 0 
Exception in thread main java.lang.ArithmeticException:/ by zero 
*/

public class Q_35 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first no");
		int num1=scanner.nextInt();
		System.out.println("enter the second numbeer");
		int num2=scanner.nextInt();
		try {
			int store=num1/num2;
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exception");
		System.out.println(e.getMessage());

		}
		
		// TODO Auto-generated method stub

	}

}
