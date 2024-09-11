package Module2;


//Create a class to print the area of a square and a rectangle. The class has two methods
//with the same name but different number of parameters. The method for printing
//area of a rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is side
//of square.
class area{
  void meth1(int l,int b){
      System.out.println("area of rectangle:  "+(l*b));

  }
  void meth1(int s){
      System.out.println("area of square :"+(s*4));

  }
}

public class Q_22 {
  public static void main(String[] args) {
      area a1=new area();
      a1.meth1(4,5);
      a1.meth1(6);

  }
}