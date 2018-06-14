package com.scp.designpattern.singletone;

public class ThreadSafeSigleTone {

	public static void main(String[] args) {
		ThreadSafeStudent s1 = ThreadSafeStudent.getInstance();
		ThreadSafeStudent s2 = ThreadSafeStudent.getInstance();

		System.out.println(s1 == s2); // will print true if both the object
										// references
										// point to same memory location
	}
}

/**
 * this will over come the issue in Lazy Initialization by using thread safe method 
 * 
 * Still there is a problem with this implementation
 * If two threads simultaneously executes the statement which is meant for null check over student object
 * then both the thread will go for synchronized block, it is obvious that only one thread at a time will execute synchronized block
 * but as the second thread have already have executed the null check statement it will again create the new instance of ThreadSafeStudent
 * 
 * */

class ThreadSafeStudent{
	private ThreadSafeStudent(){
		
	}
	
	private static ThreadSafeStudent student;
	
	public static ThreadSafeStudent getInstance() {
		if(student == null)
			synchronized (Student.class){
						student= new ThreadSafeStudent();	
			}
		return student;
	}
}
