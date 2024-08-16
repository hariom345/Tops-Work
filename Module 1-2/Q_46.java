package Module2;
//• W.A.J.P to start the same Thread twice by calling start () method twice. Test
//ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
class Twice extends Thread{
  public void run(){
      System.out.println("I am running twice");
  }
}

public class Q_46 {
  public static void main(String[] args) {
      Twice t=new Twice();
      t.start();
      t.start();

  }
}
