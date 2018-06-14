package com.scp.designpattern.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletoneUsingReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		StudentSingleton student1 =StudentSingleton.getInstance();
		StudentSingleton student2 = null;
		Constructor[] constructors = StudentSingleton.class.getConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			student2=(StudentSingleton) constructor.newInstance();
		} 
		
		if(student2!=null)
			System.out.println(student1==student2);
		else
			System.out.println("Second object not initialized");
	}
}

class StudentSingleton{
	private static StudentSingleton bOb;
	private StudentSingleton(){
	}
	public static StudentSingleton getInstance(){
		if(bOb==null){
			synchronized (StudentSingleton.class) {
				if(bOb==null){
						bOb=new StudentSingleton();
				}
			}
		}
		return bOb;
	}
}

