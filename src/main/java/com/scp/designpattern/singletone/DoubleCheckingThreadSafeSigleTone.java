package com.scp.designpattern.singletone;

public class DoubleCheckingThreadSafeSigleTone {
	public static void main(String[] args) {
		DoubleCheckingThreadSafeStudent s1 = DoubleCheckingThreadSafeStudent.getInstance();
		DoubleCheckingThreadSafeStudent s2 = DoubleCheckingThreadSafeStudent.getInstance();

		System.out.println(s1 == s2); // will print true if both the object
										// references
										// point to same memory location
	}
}

class DoubleCheckingThreadSafeStudent{
	private DoubleCheckingThreadSafeStudent(){
		
	}
	
	private static DoubleCheckingThreadSafeStudent student;
	
	public static DoubleCheckingThreadSafeStudent getInstance() {
		if(student == null)
			synchronized (Student.class){
				if(student!=null)
					student= new DoubleCheckingThreadSafeStudent();							
			}
		return student;
	}
}
