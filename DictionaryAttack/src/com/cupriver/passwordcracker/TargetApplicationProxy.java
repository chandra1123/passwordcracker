package com.cupriver.passwordcracker;

/**
 * A proxy for Target Application to crack. Use to login to the target application.
 * 
 * @author Chandra Prakash.
 *
 */
public interface TargetApplicationProxy {

	boolean login(String username, String password);

}
