package Module2;

import java.net.Socket;

/*Create a class named 'Member' having the following members: 
1. Data members 
2. Name 
3. Age 
4. Phone number 
5. Address 
6. Salary 
It also has a method named 'printSalary' which prints the salary of the members

*/
class Member{
	String name;
	int age;
	long phonenumber;
	String address;
	int salary;
	public Member(String name, int age, long phonenumber, String address, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.address = address;
		this.salary = salary;
		salary();
	}
	void salary() {
		System.out.println("salary \t"+salary);
	}
	
}

public class Q_24 {
    public static void main(String[] args) {
    	Member m1=new Member("Hariom", 20,2393939390L,"gujarat",250000);

    }
}
