package Module2;

// W.A.J.P to check whether a given string starts with the contents of another string.
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red? False I3.

public class Q_17 {
  public static void main(String[] args) {
      String s1="Red is favorite color";
      String s2="range is also my favorite color";
     if(s1.startsWith("Red") && s2.startsWith("Red") ){
         System.out.println(true);
     }
     else
         System.out.println(false);

  }
}