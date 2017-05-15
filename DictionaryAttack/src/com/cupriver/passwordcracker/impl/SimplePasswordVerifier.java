package com.cupriver.passwordcracker.impl;

import com.cupriver.passwordcracker.PasswordVerifier;
import com.cupriver.passwordcracker.TargetApplicationProxy;

public class SimplePasswordVerifier implements  PasswordVerifier{
	
	private TargetApplicationProxy targetApplicationProxy;
	private String userName;
	
	public SimplePasswordVerifier(TargetApplicationProxy targetApplicationProxy, String userName) {
		this.targetApplicationProxy = targetApplicationProxy;
		this.userName = userName;
		
	}

	@Override
	public boolean isValidPassword(String password) {
		return targetApplicationProxy.login(userName, password);
	}

}
