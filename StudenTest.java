package November;

import November.Student;

public class StudenTest {

	public static void main(String[] args) {
		Student input=new Student ();
		input.studentName="gokhan";
		input.studentId=1903;
		input.numberOfStudent ++;
		System.out.println("number "+input.numberOfStudent + " student name is " + input.studentName);
		Student input2=new Student();
		input2.studentName="caliskan";
		input2.studentId=2022;
		input2.numberOfStudent ++;
		System.out.println("number " + input2.numberOfStudent + " Student name is " + input2.studentName );
		Student input3=new Student ();
		input3.studentName="sas";
		input3.studentId=1992;
		input3.numberOfStudent ++;
		
		System.out.println("number " + input3.numberOfStudent + " Student name is " + input3.studentName);
			System.out.println("total number of student : " + input3.numberOfStudent);

	}

}
