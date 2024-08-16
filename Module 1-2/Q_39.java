package Module2;

import java.util.Scanner;

//• W.A.J. P to demonstrate try catch block, take two numbers from the user by
//Command line argument and perform the division operation and handle Arithmetic
//O/PException in thread main java. Lang. Arithmetic Exception:/ by zero

public class Q_39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1");
        int num1=sc.nextInt();
        System.out.println("enter number2");
        int num2=sc.nextInt();
        int result;
        try{
            System.out.println(result=num1/num2);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }




    }
}

