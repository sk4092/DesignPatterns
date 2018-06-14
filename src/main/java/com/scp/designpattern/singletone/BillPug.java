package com.scp.designpattern.singletone;

public class BillPug {

	public static void main(String[] args) {
		BillPugStudent s1 = BillPugStudent.getInstance();
		BillPugStudent s2 = BillPugStudent.getInstance();

		System.out.println(s1 == s2); // will print true if both the object
										// references
										// point to same memory location
	}
}

class BillPugStudent {
	private static final class innerClass {
		private static final BillPugStudent xOb = new BillPugStudent();
	}

	private BillPugStudent() {
	}

	public static BillPugStudent getInstance() {
		return innerClass.xOb;
	}
}
