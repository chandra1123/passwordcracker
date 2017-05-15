package com.cupriver.passwordcracker.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

import com.cupriver.passwordcracker.PasswordDataSource;

public class PasswordFileDataSource implements PasswordDataSource {

	BufferedReader br = null;

	public PasswordFileDataSource(String path) throws FileNotFoundException {
		br = new BufferedReader(new FileReader(path));
	}

	@Override
	public Stream<String> getPasswords() {
		if (br == null) {
			throw new IllegalArgumentException("No file reader to read.");
		}
		Stream<String> words = br.lines();
		return words;
	}

	@Override
	public void close() {
		if (br != null) {
			try {
				br.close();
				br = null;
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
	}

}
