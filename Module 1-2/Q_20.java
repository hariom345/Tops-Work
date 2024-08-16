package Module2;

//Create a class
//named 'Print Number' to print various numbers of different data types
//by creating different methods with the same name 'printn' having a parameter for
//each data type
class Printnumber{
 void printn(int a){
     System.out.println(a);
 }
 void printn(short a){
     System.out.println(a);
 }
 void printn(float a){
     System.out.println(a);
 }
 void printn(double a){
     System.out.println(a);
 }
 void printn(long a){
     System.out.println(a);
 }


}
public class Q_20 {
 public static void main(String[] args) {
     Printnumber p1=new Printnumber();
     p1.printn(54.8888888);

 }
}