package com.scp.designpattern.builder.model;

public class Computer {

	private String hdd;
	private String ram;

	private boolean isGraphicsCardEnabled;
	private boolean isCdDriveAvailable;
	private String computerModel;

	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isCdDriveAvailable() {
		return isCdDriveAvailable;
	}

	public String getComputerModel() {
		return computerModel;
	}

	private Computer(ComputerBuilder computerBuilder) {
		this.hdd = computerBuilder.hdd;
		this.ram = computerBuilder.ram;
		this.isCdDriveAvailable = computerBuilder.isCdDriveAvailable;
		this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
		this.computerModel = computerBuilder.computerModel;
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isCdDriveAvailable=" + isCdDriveAvailable + ", computerModel=" + computerModel + "]";
	}

	public static class ComputerBuilder {
		private String hdd;
		private String ram;

		private boolean isGraphicsCardEnabled;
		private boolean isCdDriveAvailable;
		private String computerModel;

		public ComputerBuilder(String hdd, String ram) {
			super();
			this.hdd = hdd;
			this.ram = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setCdDriveAvailable(boolean isCdDriveAvailable) {
			this.isCdDriveAvailable = isCdDriveAvailable;
			return this;
		}

		public ComputerBuilder setComputerModel(String computerModel) {
			this.computerModel = computerModel;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
