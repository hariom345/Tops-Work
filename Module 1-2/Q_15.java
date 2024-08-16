package Module2;

import java.util.Scanner;

//W.A.J.P to compare a given string to the specified character sequence. Comparing
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
public class Q_15 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first string");
      String str1=sc.next();
      System.out.println("enter the second string");
      String str2=sc.next();
      if(str1.equals(str2)){
          System.out.println(true);
      }
      else
          System.out.println(false);

  }
}