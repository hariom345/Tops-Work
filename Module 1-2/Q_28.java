package Module2;

//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
//having a method with the same name 'message' that prints "This is first subclass"
//and "This is second subclass" respectively. Call the methods 'message' by creating
//an object for each subclass.
abstract  class parent2{
  abstract void  message();

}
class child1 extends parent2{
  @Override
  void message(){
      System.out.println("this is the first sub  class");
  }
}
class child2 extends parent2{
  @Override
  void message(){
      System.out.println("this is the second sub  class");
  }
}

public class Q_28 {
  public static void main(String[] args) {
      child1 c1=new child1();
      c1.message();
      child2 c2=new child2();
      c2.message();

  }

}

