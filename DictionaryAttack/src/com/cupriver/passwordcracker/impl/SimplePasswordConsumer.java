package com.cupriver.passwordcracker.impl;

import com.cupriver.passwordcracker.PasswordConsumer;

public class SimplePasswordConsumer implements PasswordConsumer {

	@Override
	public void consume(String password) {
		System.out.println("Found password:" + password);
	}

}
