package Module2;
//• W.A.J. P to create one thread by implementing Runnable interface in
//Class
class MyThread implements Runnable{

  @Override
  public void run() {
      System.out.println("Thread is running");
  }
}
public class Q_43 {
  public static void main(String[] args) {
      MyThread thread=new MyThread();
      Thread th=new Thread(thread);
      th.start();


  }
}

