package Module2;

//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
//5 units by creating a class named 'Triangle' without any parameter in its constructor.
class triangle{
  int length=3;
  int  base=4;
  int height=5;
  triangle(){
      area();
      perimeter();

  }
  void area(){
      System.out.println("area of triangle :"+(base*height)/2);
  }
  void perimeter(){
      System.out.println("area of triangle :"+(base+height+length));
  }
}

public class Q_26 {
  public static void main(String[] args) {
      triangle t1=new triangle();

  }
}

