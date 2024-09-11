package Module2;


//Create a class with a method that prints "This is a parent class" and its subclass with
//another method that prints "This is child class". Now, create an object for each of
//the class and call 1 - method of parent class by object of parent class 2 - method of
//child class by object of child class 3 - method of parent class by object of child class
class parent{
  void p(){
      System.out.println("this is parent class");
  }
}
class child extends parent{
  void c(){
      System.out.println("this is child class");
  }
}

public class Q_23 {
  public static void main(String[] args) {
      parent obj=new parent();
      child obj1=new child();
      obj.p();
      obj1.c();
      obj1.p();

  }
}

