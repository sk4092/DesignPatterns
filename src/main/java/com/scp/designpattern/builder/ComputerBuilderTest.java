package com.scp.designpattern.builder;

import com.scp.designpattern.builder.model.Computer;

public class ComputerBuilderTest {

	public static void main(String[] args) {

		Computer computerWithCdDrive = new Computer.ComputerBuilder("1TB", "16GB").setCdDriveAvailable(true).build();
		Computer computerWithGraphicsCard = new Computer.ComputerBuilder("500GB", "8GB").setGraphicsCardEnabled(true)
				.build();
		Computer computerWithGraphicsCard2 = new Computer.ComputerBuilder("500GB", "8GB").setGraphicsCardEnabled(true)
				.setComputerModel("DELL1504").build();

		System.out.println(computerWithGraphicsCard);
		System.out.println(computerWithCdDrive);
		System.out.println(computerWithGraphicsCard2);
	}

}
