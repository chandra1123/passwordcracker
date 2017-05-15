package com.cupriver.passwordcracker;

import java.util.stream.Stream;

/**
 * Generates various forms of password for a given password.
 * @author Chandra Prakash
 *
 */
public interface PasswordCombinationGenerator {
	Stream<String> getPasswordCombinations(String password);
}
