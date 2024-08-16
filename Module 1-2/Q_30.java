package Module2;

//We have to calculate the percentage of marks obtained in three subjects (each out of
//100) by student A and in four subjects (each out of 100) by student B. Create an
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
//other classes 'A' and 'B' each having a method with the same name which returns the
//percentage of the students. The constructor of student A takes the marks in three
//subjects as its parameters and the marks in four subjects as its parameters for student
//B. Create an object for each of the two classes and print the percentage of marks for
//both the students.
abstract class Mark{
  abstract void getpercentage();
}
class A extends Mark{
  float sub1;
  float sub2;
  float sub3;

  public A(float sub1,float sub2,float sub3) {
      this.sub1=sub1;
      this.sub2=sub2;
      this.sub3=sub3;
      getpercentage();

  }

  void getpercentage(){
      float result=((sub1+sub2+sub3)/300)*100;
      System.out.println("your percentage is :"+result);

  }

}
class B extends Mark{
  float sub1;
  float sub2;
  float sub3;
  float sub4;

  public B(float sub1,float sub2,float sub3,float sub4) {
      this.sub1=sub1;
      this.sub2=sub2;
      this.sub3=sub3;
      this.sub4=sub4;
      getpercentage();

  }

  void getpercentage(){
      float result=((sub1+sub2+sub3+sub4)/400)*100;
      System.out.println("your percentage is :"+result);

  }

}

public class Q_30 {
  public static void main(String[] args) {
      A a1=new A(34,56,67);
      B b1=new B(67,89,94,64);

  }
}

