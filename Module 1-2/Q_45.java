package Module2;
//W.A.J.P to create 2 threads and execute that threads by providing sleep time as
//2000ms and check the execution.
class Panda extends Thread{
public void run(){
    try{
        for (int i = 0; i <50 ; i++) {
            Thread.sleep(2000);
            System.out.println("I am sleeping");
        }

    }catch (Exception e){
        System.out.println(e.getMessage());
    }


 }
}
class Lion extends Thread{
 public void run(){
     for (int i = 0; i <50 ; i++) {
         System.out.println("I am Eating");
     }


 }
}

public class Q_45 {
 public static void main(String[] args) {
     Panda sleep=new Panda();
     Lion eat=new Lion();
     sleep.start();
     eat.start();

 }
}

