package com.starbucks;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CaesarCipher {

    protected CaesarCipher() {}

	public static String encode(String s, int shift) {
		if (s == null) throw 
     		new NullPointerException("String cannot be null");
		if (s.isEmpty()) return "";
	    return s.chars().boxed()
	    		.map(i -> String.valueOf(processChar((char) i.intValue(), shift)))
	    		.collect(Collectors.joining());
	}

	
	protected static char processChar(char c, int shift) {
		if (!Character.isAlphabetic(c)) return c;
		char preferredA = Character.isUpperCase(c) ? 'Z' : 'a';
		return (char) ((c + (shift % 26) + 26 - preferredA) % 26 + preferredA);
	}

	public static String decode(String string, int shift) {
		return encode(string, -shift);
	}
}
