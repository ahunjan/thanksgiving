package com.starbucks;

public class CaesarCipher {

	public static String encode(String s, int shift) {
		if (s.isEmpty()) return "";
		return "" + (char) (s.charAt(0) + shift);
	}

}
