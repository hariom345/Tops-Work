package Module2;

//• W.A.J.P to create a custom exception if Customer withdraw amount which is greater
//than account balance then program will show custom exception otherwise amount
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
//2500
//Sorry, insufficient balance, you need more 500 Rs. To perform this transaction
class InsufficentBalanceException extends Exception{
  String insufficentBal(){
      return "Invalid Amouunt Enter You nedd more 500";

  }

}
class Account {
  int balance=2000;
  void withdraw(int amount)throws InsufficentBalanceException{
      if (amount>balance){
          throw new InsufficentBalanceException();

      }
      else {
          balance=balance-amount;
          System.out.println("withdraw Successfully");
          System.out.println("Available balance\t"+balance);

      }


  }
}
public class Q_41 {
  public static void main(String[] args) {
      Account account=new Account();
      try {
          account.withdraw(2500);
      } catch (InsufficentBalanceException e) {
          System.out.println(e.insufficentBal());
      }

  }
}

