package Module2;

//Create a class to print an integer and a character with two methods having the same
//name but different sequence of the integer and the character parameters. For
//example, if the parameters of the first method are of the form (int n, char c), then
//that of the second method will be of the form (char c, int n).
class intchar{
 void meth1(int a,char c){
     System.out.println("  :"+a+ c);
 }
 void meth1(char c,int a){
     System.out.println("  :"+c+ a);
 }
}

public class Q_21 {
 public static void main(String[] args) {
     intchar v1=new intchar();
     v1.meth1(76,'f');
     v1.meth1('h',65);

 }
}
