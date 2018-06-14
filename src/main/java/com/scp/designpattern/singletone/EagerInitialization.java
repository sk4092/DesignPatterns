package com.scp.designpattern.singletone;

public class EagerInitialization {

	public static void main(String[] args) {

		Student s1 = Student.getInstance();
		Student s2 = Student.getInstance();
		
		System.out.println(s1==s2);	//will print true if both the object references
									//point to same  memory location
		
		
		Employee e1=Employee.getInstance();
		Employee e2=Employee.getInstance();
		System.out.println(e1==e2);
	}
}
/**
 * problem with this implementation of singletone pattern is
 *  the object of student is loaded in memory even if it never used 
 */
class Student{
	
	private static final Student s= new Student();
	private Student (){
		
	}
	
	public static Student getInstance(){
		return s;
	}
}

class Employee{
	
	private static final Employee emp;
	private Employee(){
		
	}
	static{
		emp=new Employee();
	}
	public static Employee getInstance(){
		return emp;
	}
	
	
}

