package Module2;

//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
//method by creating an object of each of the three classes.
abstract class Bank{
 abstract  void getbalance(long amount);
}
class bankA extends Bank{

 void getbalance(long amount){
     System.out.println("your amount of bank A is this  :"+amount);
 }
}
class bankB extends Bank{
 void getbalance(long amount){
     System.out.println("your amount of bankB is this    :"+amount);
 }
}
class bankC extends Bank{
 void getbalance(long amount){
     System.out.println("your amount of bankc is this   :"+amount);
 }
}


public class Q_29 {
 public static void main(String[] args) {
     bankA a=new bankA();
     bankB b=new bankB();
     bankC c=new bankC();
     a.getbalance(1000);
     b.getbalance(10008);
     c.getbalance(3000);

 }
}

