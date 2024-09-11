package Module2;


import java.util.Scanner;

//• W.A.J.P to create the validate method that takes integer value as a parameter. If the
//age is less than 18, then throw an Arithmetic Exception otherwise print a message
//welcome to vote.
//O/P- Enter your age: 16
//Exception in thread main java. Lang. Arithmetic Exception: not valid
class AgeValidator{
   void  vadidate(int age) {

           if (age < 18) {
              throw new ArithmeticException("not valid");
           }
           else {
               System.out.println("welcome to vote");
           }

   }
}

public class Q_40 {
    public static void main(String[] args) {
        AgeValidator ag=new AgeValidator();
        ag.vadidate(3);


    }
}

