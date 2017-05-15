package com.cupriver.passwordcracker;

/**
 * Verifies whether a password is valid.

 * @author Chandra Prakash.
 *
 */
public interface PasswordVerifier {
	boolean isValidPassword(String password);
}
