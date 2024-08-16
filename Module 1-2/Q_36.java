package Module2;
//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
//exception and another one is to handle 

public class Q_36 {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[5] = 30 / 0;
            System.out.println(a[10]); //
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}