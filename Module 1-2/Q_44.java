package Module2;
//W.A.J. P to create one thread by extending Thread class in another Class.
class MyClass extends Thread{
public void run(){
    System.out.println("MY thread");
 }
}

public class Q_44 {
 public static void main(String[] args) {
     MyClass my=new MyClass();
     my.start();

 }
}
