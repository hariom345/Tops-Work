package Module2;
import java.util.Scanner;
//// Write a Java program that takes a year from user and print whether that year is a leap
//year or not.
public class Q_3 {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		        System.out.println("enter the year");
		        int year = sc.nextInt();
		        if (year % 4 == 0  && year%100!=0 || year%400==0) {
		            System.out.println(year + "\tis a leap year");
		        }
		        else
		            System.out.println(year+"\tis not a leap year");
		        //B19. Write a program in Java to display the first 10 natural numbers
		      //using while loop
		              int i=1;
		              while(i<=10){
		                  System.out.println(i);
		                  i++;
		              }

		       
	}

}
