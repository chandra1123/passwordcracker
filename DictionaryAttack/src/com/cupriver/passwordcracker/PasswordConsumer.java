package com.cupriver.passwordcracker;

/**
 * A consumer for passwords. e.g write to a file.
 * 
 * @author Chandra Prakash
 *
 */
public interface PasswordConsumer {
	void consume(String password);
}
