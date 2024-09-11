package Module2;
//• Print the sum, difference and product of two complex numbers by creating a class
//named 'Complex' with separate methods for each operation whose real and
//imaginary parts are entered by user.
class complex{
  int real;
  int imiganiary;
  complex(int real,int imiganiary){
      this.real=real;
      this.imiganiary=imiganiary;
      sum();;
      difference();
      product();
  }

  void sum(){
      System.out.println("sum: "+(real+imiganiary));

  }
  void difference(){

      System.out.println("difference: "+(real-imiganiary));
}
  void product(){
      System.out.println("product: "+(real*imiganiary));
  }}
public class Q_27 {
  public static void main(String[] args) {
      complex c1=new complex(20,10);

  }
}

