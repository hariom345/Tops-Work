package Module2;


import static java.lang.System.out;

//• W.A.J.P to create a class Student with attributes roll no, name, age and course.
//Initialize values through parameterized constructor. If age of student is not in
//between 15 and 21 then generate user defined exception
//"AgeNotWithinRangeException". If name contains numbers or special symbols
//raise exception "NameNotValidException". Define the two exception classes.
class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}
 class NameNotValidException extends Exception{
    public NameNotValidException(String message){
      super(message);
    }
 }

class Student{
    int roll;
    String name;
    int age;
    String course;

    public Student(int roll, String name, int age, String course)throws AgeNotWithinRangeException,NameNotValidException{
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
        if(age<15 || age>21){
            throw new AgeNotWithinRangeException("pls enter the age between 15 and 21");
        }
        if(!isValidName(name)){
            throw new NameNotValidException("pls enter the valid name");

        }
    }
    public boolean isValidName(String name) {

        return name.matches("[a-zA-Z]+");
    }





    }



public class Q_42 {
    public static void main(String[] args) {

        try {
            Student sd=new Student(1,"JAISHREERAM",145,"@Python");
            Student sd1=new Student(1,"13JAISHREERAM",16,"@Python");
        } catch (AgeNotWithinRangeException e) {
            out.println(e.getMessage());
        } catch (NameNotValidException e) {
            out.println(e.getMessage());
        }



    }
}
