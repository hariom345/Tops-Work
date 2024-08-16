package Module2;


//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
//two methods to print the area and perimeter of the rectangle respectively. Its
//constructor having parameters for length and breadth is used to initialize the length
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
//constructor having a parameter for its side (suppose s) calling the constructor of its
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
class rectangle{
 int length;
 int breadth;

 public rectangle(int length,int breadth){
     this.length=length;
   this.breadth=breadth;
       area();
     perimeter();


 }
 public void area(){
     System.out.println("area of rectangle :"+(length*breadth));
 }

  public void perimeter(){
     System.out.println("perimeter of rectangle :"+(length+breadth)*2);
 }
}
class square extends rectangle{
int side;
  square(int lenght,int breadth,int side){
      super(lenght,breadth);
   this.side=side;

     area1();
     perimeter1();


 }
 public void area1(){
     System.out.println("area of square :"+(side*4));
 }

 public void perimeter1(){
     System.out.println("perimeter of square :"+(side*2));
 }
}

public class Q_25 {
 public static void main(String[] args) {
square s1=new square(5,6,10);

 }
}

