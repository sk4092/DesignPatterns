package com.scp.designpattern.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletoneUsingReflection {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		StudentSingleton2 student1 =StudentSingleton2.getInstance();
		StudentSingleton2 student2 = null;
		@SuppressWarnings("rawtypes")
		Constructor[] constructors = StudentSingleton2.class.getConstructors();
		for (Constructor<StudentSingleton2> constructor : constructors) {
			constructor.setAccessible(true);
			student2=(StudentSingleton2) constructor.newInstance();
		} 
		
		
		// TODO : Learn more about this as this is returning Second object not initialized
		//while debugging student 2 is not getting any value/object ie. it is null through out the program. 
		if(student2!=null)
			System.out.println(student1==student2);
		else
			System.out.println("Second object not initialized");
	}
}

class StudentSingleton2{
	private static StudentSingleton2 obj;
	private StudentSingleton2(){
	}
	public static StudentSingleton2 getInstance(){
		if(obj==null){
			synchronized (StudentSingleton2.class) {
				if(obj==null){
						obj=new StudentSingleton2();
				}
			}
		}
		return obj;
	}
}

