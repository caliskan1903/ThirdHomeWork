package November;

import November.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee input=new Employee (); 
		input.empID=1903;
		input.salary=10000;
		System.out.println("ID : " + input.empID);
		System.out.println("salary : " + input.salary);
		System.out.println("CEO : " + input.ceo);
		System.out.println("--------------------------");

		Employee input2=new Employee();
		input2.empID=1881;
		input2.salary=30000;
		System.out.println("ID : " + input2.empID);
		System.out.println("salary : " + input2.salary);
		System.out.println("ceo : " + input2.ceo);

	}

}
