package com.scp.designpattern.singletone;

public class LazyInitialization {

	public static void main(String[] args) {
		LazyStudent s1 = LazyStudent.getInstance();
		LazyStudent s2 = LazyStudent.getInstance();

		System.out.println(s1 == s2); // will print true if both the object
										// references
										// point to same memory location
	}

}
/**
 * This will over come the issue with eager loading
 * BUT 
 * 
 * still there is problem with this implementation of singletone pattern,
 *  in multi-threaded environment if two or more threads access the get instance method 
 * there might be a chance of multiple object creation   
 */
class LazyStudent {

	private static LazyStudent student;
	private LazyStudent() {
	}

	public static LazyStudent getInstance() {
		if (student == null) {
			student = new LazyStudent();
		}
		return student;
	}
}
