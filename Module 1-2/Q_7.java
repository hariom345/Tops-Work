package Module2;

import java.util.*;
//• Write a Java program that reads a positive integer and count the number of digits the
//number.
public class Q_7 {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int number=sc.nextInt();
int count=0;
int num1=number;

 while (num1>0){
     count++;
     num1/=10;

  }
  System.out.println("number of digit\t"+count);

  }
}
