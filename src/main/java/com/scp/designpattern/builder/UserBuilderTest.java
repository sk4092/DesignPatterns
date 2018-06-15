package com.scp.designpattern.builder;

import com.scp.designpattern.builder.model.User;

public class UserBuilderTest {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Sweapnil", "Kumbhar", 7798535966L).build();
		User user2 = new User.UserBuilder("Sweapnil", "Kumbhar", 1234567890L).setAddress("pune").build();
		User user3 = new User.UserBuilder("Abhijeet", "Ghorpade", 9096231001L).setAge(27).build();
		User user4 = new User.UserBuilder("Akash", "Kumbhar", 9823519515L).setAddress("Karad").setAge(20).build();

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
	}
}
