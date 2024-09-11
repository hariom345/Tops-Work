//• Write a Java program to Take three numbers from the user and print the greatest 
//number.
package Module2;

import java.util.*;

public class Q_1 {
	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	        System.out.println("enter the first number\t");
	        int num1=sc.nextInt();
	        System.out.println("enter the second number\t");
	        int num2=sc.nextInt();
	        System.out.println("enter the third number\t");
	        int num3=sc.nextInt();
	        if(num1>num2 && num1>num3){
	            System.out.println("greatest number\t"+num1);
	        } else if (num2>num1 && num2>num3) {
	            System.out.println("greatest number\t"+num2);

	        }
	        else {
	            System.out.println("greatest number\t"+num3);
	        }
	}

}
