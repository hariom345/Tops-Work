package Module2;
import java.util.*;
//• Write a Java program to count the letters, spaces, numbers and other characters of
//an input string.
public class Q_8 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int isletter=0;
      int isspace=0;
      int isdigit=0;
      int isothercaracter=0;
      for (int i = 1; i <str.length(); i++) {
          char hell=str.charAt(i);
          if (Character.isLetter(hell)) {
              isletter++;
          } else if (Character.isSpaceChar(hell)) {
              isspace++;

          } else if (Character.isDigit(hell)) {

              isdigit++;
          } else
              isothercaracter++;



      }
      System.out.println("isletter \t"+isletter);
      System.out.println("isspacce \t"+isspace);
      System.out.println("isdigit \t"+isdigit);
      System.out.println("isotherchar\t"+isothercaracter);

  }
}
