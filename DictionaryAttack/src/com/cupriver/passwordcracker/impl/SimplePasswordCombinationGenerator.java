package com.cupriver.passwordcracker.impl;

import java.util.stream.Stream;

import com.cupriver.passwordcracker.PasswordCombinationGenerator;

public class SimplePasswordCombinationGenerator implements PasswordCombinationGenerator {

	@Override
	public Stream<String> getPasswordCombinations(String word) {
		return Stream.of(word.toLowerCase(), word.toUpperCase());
	}
	

}
