package com.scp.designpattern.factory;

public class Test {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","8GB", "CORD-CORE", "1TB");
		Computer server = ComputerFactory.getComputer("Server","40GB", "OCTA-CORE", "100TB");
		
		System.out.println("PC-------------- "+pc );
		System.out.println("Server-------------"+server);
	}

}
