package Module2;
//• Write a program to print the factorial of a number by defining a method named
//'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
//*(n-1) *n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also, 1! = 1
//0! = 0
import java.util.*;
class ram {
   int result =1;


   void hanuman(){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number ");
       int number = sc.nextInt();
       while (number > 0) {
           result *= number;
           number--;

       }
       System.out.println("factorial of number "+result);


   }
}



public class Q_31 {
  public static void main(String[] args) {
     ram r1=new ram();
     r1.hanuman();


  }
}
