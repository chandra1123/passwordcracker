package com.cupriver.passwordcracker.impl;

import com.cupriver.passwordcracker.DictionaryPasswordCracker;
import com.cupriver.passwordcracker.PasswordCombinationGenerator;
import com.cupriver.passwordcracker.PasswordConsumer;
import com.cupriver.passwordcracker.PasswordDataSource;
import com.cupriver.passwordcracker.PasswordVerifier;
import com.cupriver.passwordcracker.TargetApplicationProxy;
import com.cupriver.passwordcracker.mock.TargetApplication;

public class DictionaryAttack {

	public static void main(String[] args) throws Exception {
		String userName = "Test User";
		String password = "ZYBALA";
		TargetApplicationProxy targetApplicationProxy = getTargetApplication(userName, password);		
		PasswordVerifier verifier = new SimplePasswordVerifier(targetApplicationProxy, userName);
		
		PasswordCombinationGenerator generator = new SimplePasswordCombinationGenerator();
		PasswordConsumer passwordConsumer = new SimplePasswordConsumer();
		DictionaryPasswordCracker  dictionaryPasswordCracker = new SimpleDictionaryPasswordCracker();
		PasswordDataSource ds = new PasswordFileDataSource("words.txt");

		dictionaryPasswordCracker.crackPassword(ds, generator, verifier, passwordConsumer);
	}


	private static TargetApplicationProxy getTargetApplication(String userName, String password) {
		TargetApplicationProxy targetApplicationProxy = TargetApplication.getTargetApplication(userName, password);
		return targetApplicationProxy;
	}

}
