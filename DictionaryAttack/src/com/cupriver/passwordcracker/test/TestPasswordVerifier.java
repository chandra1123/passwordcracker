package com.cupriver.passwordcracker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cupriver.passwordcracker.PasswordVerifier;
import com.cupriver.passwordcracker.TargetApplicationProxy;
import com.cupriver.passwordcracker.impl.SimplePasswordVerifier;
import com.cupriver.passwordcracker.mock.TargetApplication;

public class TestPasswordVerifier {
	
	String userName = "Test User";
	String password = "ZYBALA";
	TargetApplicationProxy targetApplicationProxy = TargetApplication.getTargetApplication(userName, password);
	
	@Test
	public void testValidPassowrd() {
		PasswordVerifier passwordVerifier = new SimplePasswordVerifier(targetApplicationProxy, userName);
		boolean isPasswordValid = passwordVerifier.isValidPassword(password);
		assertTrue(isPasswordValid);
	}
	
	@Test
	public void testInvalidPassword() {
		String invalidPassword = "hello";
		PasswordVerifier passwordVerifier = new SimplePasswordVerifier(targetApplicationProxy, userName);
		boolean isPasswordValid = passwordVerifier.isValidPassword(invalidPassword);
		assertFalse(isPasswordValid);
	}
	
	@Test
	public void testInvalidUser() {
		String invalidUserName = "Invalid User";
		PasswordVerifier passwordVerifier = new SimplePasswordVerifier(targetApplicationProxy, invalidUserName);
		boolean isPasswordValid = passwordVerifier.isValidPassword(password);
		assertFalse(isPasswordValid);
	}	

}
