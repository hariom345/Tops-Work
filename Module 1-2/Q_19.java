package Module2;

//• W.A.J.P to find the second most frequent character in a given string. The given string
//is: successes The second most frequent char in the string is: c
import java.util.*;
public class Q_19 {
  public static void main(String[] args) {
     Scanner cs=new Scanner(System.in) ;
     String paav=cs.next();
      char[] carray = paav.toCharArray();
     char count;
      for (int i =0; i <paav.length() ; i++) {
          for (int j = i+1; j <paav.length() ; j++) {
           if(carray[i]==carray[j]){
               System.out.print(carray[j] + " ");
               break;
           }
          }
      }

  }
}