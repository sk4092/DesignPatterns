package com.scp.designpattern.abstractfactory;

public class Test {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PcFactory("8GB", "CORD-CORE", "1TB"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("40GB", "OCTA-CORE", "100TB"));
		
		System.out.println("PC-------------- "+pc );
		System.out.println("Server-------------"+server);
	}

}
