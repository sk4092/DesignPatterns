package com.scp.designpattern.abstractfactory;

public class Server extends Computer {

	private String ram;
	private String cpu;
	private String hdd;

	public Server(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getCpu() {
		return this.cpu;
	}

	@Override
	public String getHdd() {
		return this.hdd;
	}

}
