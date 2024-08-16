package Module2;

//Write a program in Java to make such a pattern like right angle triangle with number
//increased by 1 The pattern like:
//1
//2 3
//4 5 6
//7 8 9 10
public class Q_6 {
 public static void main(String[] args) {
     int count=1;
     for (int i =1; i <=4 ; i++) {
         for (int j =i; j>=i ; j++) {
             System.out.println(count+" ");
            ++count;

         }
     }

 }
}
