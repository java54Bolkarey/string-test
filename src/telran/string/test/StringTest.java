package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.DisplayName;
class StringTest {

	@Test
	@DisplayName("test of the method concat")
	
	
	void concatTest() {
		String hello = "Hello";
		
		assertEquals("Hello World!!!", hello.concat(" World").concat("!!!"));
		
	}

	@Test
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}

	@Test
    void compareToTest() {
        
        String str1 = "abc";
        String str2 = "def";
        assertTrue(str1.compareTo(str2) < 0); 
    }

    @Test
    void compareToIgnoreCaseTest() {
        String str1 = "abc";
        String str2 = "DEF";
        assertTrue(str1.compareToIgnoreCase(str2) < 0); 
    }

    @Test
    void concatTest1() {
        String str1 = "Hello";
        String str2 = " World";
        assertEquals("Hello World", str1.concat(str2));
    }

    @Test
    void startsWithTest() {
        String str1 = "Hello World";
        assertTrue(str1.startsWith("Hello"));
        assertFalse(str1.startsWith("World"));
    }

    @Test
    void endsWithTest() {
        String str1 = "Hello World";
        assertTrue(str1.endsWith("World"));
        assertFalse(str1.endsWith("Hello"));
    }

    @Test
    
    void equalsIgnoreCaseTest() {
        String str1 = "hello";
        String str2 = "HELLO";
        assertTrue(str1.equalsIgnoreCase(str2));
    }

    @Test
    void indexOfTest() {
        String str1 = "Hello World";
        assertEquals(6, str1.indexOf("World"));
    }

    @Test
    void lastIndexOfTest() {
        String str = "Hello World";
        assertEquals(8, str.lastIndexOf('r'));
    }

}
   



