package com.scp.designpattern.abstractfactory;

public abstract class Computer {

	public abstract String getRam();
	public abstract String getCpu();
	public abstract String getHdd();
	@Override
	public String toString() {
		return "Computer [getRam()=" + getRam() + ", getCpu()=" + getCpu() + ", getHdd()=" + getHdd() + "]";
	}
}
