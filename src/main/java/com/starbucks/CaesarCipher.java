package com.starbucks;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CaesarCipher {	
	public static String encode(String s, int shift) {
		if (s == null) throw 
     		new NullPointerException("String cannot be null");
		if (s.isEmpty()) return "";
	    return s.chars().boxed().map(i -> "" + processChar((char) i.intValue(), shift)).collect(Collectors.joining());
	}

	public static String encodeBeforeInline(String s, int shift) {
		if (s == null) throw 
     		new NullPointerException("String cannot be null");
		if (s.isEmpty()) return "";
	    IntStream chars = s.chars();
		Stream<Integer> boxed = chars.boxed();
		Stream<String> mapped = boxed.map(new Function<Integer, String>() {
			@Override
			public String apply(Integer i) {
				return "" + processChar((char) i.intValue(), shift);
			}
		});
		String collected = mapped.collect(Collectors.joining());
		return collected;
	}
	
	protected static char processChar(char c, int shift) {
		if (!Character.isAlphabetic(c)) return c;
		char preferredA = Character.isUpperCase(c) ? 'A' : 'a';
		return (char) ((c + shift - preferredA) % 26 + preferredA);
	}

}
