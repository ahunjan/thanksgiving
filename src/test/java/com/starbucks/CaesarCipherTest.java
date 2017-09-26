package com.starbucks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CaesarCipherTest {

    /**
     * Choose the simplest thing to test I call the anchor, and build off of it
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

    @Test
    public void testTwoLetters() {
        String result = CaesarCipher.encode("ab", 1);
        assertThat(result).isEqualTo("bc");
    }

    @Test
    public void testWithNullClassicWay() {
        try {
            CaesarCipher.encode(null, 1);
            fail("This line should never run");
        } catch (NullPointerException npe) {
            assertThat(npe).hasMessage("String cannot be null");
        }
    }

    //Green Bar
    @Test
    public void testWithNullAssertJ() {
        assertThatThrownBy(() -> CaesarCipher.encode(null, 1))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("String cannot be null");
    }

    @Test
    public void testSmallZAndShiftOf1() {
    	    String result = CaesarCipher.encode("z", 1);
        assertThat(result).isEqualTo("a");
    }

    //Green Bar
    @Test
    public void testSmallZAndShiftOf26() {
    	    String result = CaesarCipher.encode("z", 26);
        assertThat(result).isEqualTo("z");
    }
    
    @Test
    public void testSmallZAndShiftOf27() {
    	    String result = CaesarCipher.encode("z", 27);
        assertThat(result).isEqualTo("a");
    }
    
    @Test
    public void testSmallVAndShiftOf5() {
    	    String result = CaesarCipher.encode("v", 5);
        assertThat(result).isEqualTo("a");
    }
    
    @Test
    public void testUppercaseAAndShiftOf1() {
    	    char result = CaesarCipher.processChar('A', 1);
        assertThat(result).isEqualTo('B');
    }
    
    @Test
    public void testStrangeCharWithShiftOf14() {
    	    char result = CaesarCipher.processChar('~', 14);
        assertThat(result).isEqualTo('~');
    }
    
    //Green Bar
    @Test
    public void testHelloWorldWithShiftOf1() {
    	    String result = CaesarCipher.encode("Hello World!", 1);
        assertThat(result).isEqualTo("Ifmmp Xpsme!");
    }
    
}
