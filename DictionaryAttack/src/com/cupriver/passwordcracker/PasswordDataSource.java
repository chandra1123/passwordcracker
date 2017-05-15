package com.cupriver.passwordcracker;

import java.util.stream.Stream;

/**
 * A data source for dictionary words. 
 * 
 * @author Chandra Prakash
 *
 */
public interface PasswordDataSource extends AutoCloseable{
	Stream<String> getPasswords();
}
