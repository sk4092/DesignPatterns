package com.scp.designpattern.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory{
	private String ram;
	private String cpu;
	private String hdd;

	public ServerFactory(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	
	public Computer createComputer() {
		return new Server(ram,cpu,hdd);
	}
}
