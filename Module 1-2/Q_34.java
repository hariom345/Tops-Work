package Module2;
//W.A.J. P to demonstrate try catch block,
class Demostrate{
	void meth() {
		int a=20;
		try {
		System.out.println(a/0);
			
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Q_34 {
	public static void main(String[] args) {
		Demostrate d1=new Demostrate();
		d1.meth();
	}

}
