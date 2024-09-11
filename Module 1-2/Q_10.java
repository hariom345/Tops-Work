package Module2;

import java.util.Scanner;

//Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555
public class Q_10 {
 public static void main(String[] args) {
	 System.out.println("enter the nuber");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int nn=n*10+n;
	 int nnn=nn*10+n;
	 int result=n+nn+nnn;
	 System.out.println("result\t"+result);

 }
}
