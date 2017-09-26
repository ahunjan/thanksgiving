package com.starbucks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarCipherTest {
	
	/**
	 * Choose the simplest thing to test
	 * I call the anchor, and build off of it
	 */
	@Test
	public void testEmptyStringAndShiftOf0() {
		String result = CaesarCipher.encode("", 0);
		assertEquals("", result);
	}
	
	@Test
	public void testSmallAAndShiftOf0() {
		String result = CaesarCipher.encode("a", 0);
		assertThat(result).isEqualTo("a");
	}
	
	@Test
	public void testSmallAAndShiftOf1() {
		String result = CaesarCipher.encode("a", 1);
		assertThat(result).isEqualTo("b");
	}

}
