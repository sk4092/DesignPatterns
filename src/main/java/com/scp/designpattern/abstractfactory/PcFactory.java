package com.scp.designpattern.abstractfactory;

public class PcFactory implements ComputerAbstractFactory{

	private String ram;
	private String cpu;
	private String hdd;

	public PcFactory(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	
	public Computer createComputer() {
		return new PC(ram,cpu,hdd);
	}

}
