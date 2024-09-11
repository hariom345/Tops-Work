package Module2;
//.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
//Daemon () method of Thread class and check whether the thread is set daemon or
//not by using is Daemon () method.
//TestDaemonThread2 t1=new TestDaemonThread2();
//TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
//t1.setDaemon(true);//will throw exception here t2.start();


public class Q_47 extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) {
    	Q_47 t1 = new Q_47();
    	Q_47 t2 = new Q_47();

        t1.setDaemon(true); // Set t1 as daemon thread

        t1.start();
        t2.start();

        System.out.println("t1 is daemon: " + t1.isDaemon());
        System.out.println("t2 is daemon: " + t2.isDaemon());
    }
}
