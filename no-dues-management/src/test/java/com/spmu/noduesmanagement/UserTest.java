package com.spmu.noduesmanagement;

import org.junit.Test;

import com.spmu.noduesmanagement.entities.User;
import com.spmu.noduesmanagement.services.UserService;

/**
 * Unit test for simple App.
 */
public class UserTest
{

	@Test
	public void testCreateUser() {
		
		UserService userService = new UserService();
		//user
		User user = new User();
		user.setId(1234);
		user.setName("suresh");
		
		userService.createUser(user);
	}
}
