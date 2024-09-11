package Module2;
import  java.util.*;
//• Write a program in Java to input 5 numbers from keyboard and find their sum and
//average using for loop.
public class Q_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum;
        int average;
        System.out.println("enter first  number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        System.out.println("enter third number");
        int num3=sc.nextInt();
        System.out.println("enter forth number");
        int num4=sc.nextInt();
        System.out.println("enter fifth  number");
        int num5=sc.nextInt();
        sum=num1+num2+num3+num4+num5;
        average=num1+num2+num3+num4+num5/5;
        System.out.println("total sum\t"+sum);
        System.out.println("average\t"+average);


    }
}
