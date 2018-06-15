package com.scp.designpattern.builder.model;

public class User {
	// required fields
	private final String firstName;
	private final String lastName;
	private final long phone;

	// optional fields
	private final int age;
	private final String address;

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", age=" + age
				+ ", address=" + address + "]";
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private final long phone;

		private int age;
		private String address;

		public UserBuilder(String firstName, String lastName, long phone) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
		}

		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}
}
