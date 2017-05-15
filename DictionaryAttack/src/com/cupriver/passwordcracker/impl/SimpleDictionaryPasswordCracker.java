package com.cupriver.passwordcracker.impl;

import java.io.FileNotFoundException;

import com.cupriver.passwordcracker.DictionaryPasswordCracker;
import com.cupriver.passwordcracker.PasswordCombinationGenerator;
import com.cupriver.passwordcracker.PasswordConsumer;
import com.cupriver.passwordcracker.PasswordDataSource;
import com.cupriver.passwordcracker.PasswordVerifier;

public class SimpleDictionaryPasswordCracker implements DictionaryPasswordCracker{

	public void crackPassword(PasswordDataSource ds, PasswordCombinationGenerator generator, PasswordVerifier verifier, PasswordConsumer passwordConsumer) throws FileNotFoundException, Exception {
		ds
		.getPasswords()
		.flatMap(generator::getPasswordCombinations)
		.filter(verifier::isValidPassword)
		.findFirst()
		.ifPresent(passwordConsumer::consume);
		ds.close();
	}
}
