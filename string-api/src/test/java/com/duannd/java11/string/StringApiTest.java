package com.duannd.java11.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringApiTest {

    @Test
    void repeatTest() {
        String out = "Hello ".repeat(2) + "World";
        System.out.println(out);
        assertEquals("Hello Hello World", out);
    }

    @Test
    void stripTest() {
        String out = "    Duan    ".strip();
        System.out.println(out);
        assertEquals("Duan", out);
    }

    @Test
    void stripLeadingTest() {
        String out = "    Duan    ".stripLeading();
        System.out.println(out + ".End");
        assertEquals("Duan    ", out);
    }

    @Test
    void stripTrailingTest() {
        String out = "    Duan    ".stripTrailing();
        System.out.println("Start." + out);
        assertEquals("    Duan", out);
    }

    @Test
    void diffTrimAndStripTest() {
        String input = "\n\t  hello   \u2005";
        String stripOut = input.strip();
        String trimOut = input.trim();
        System.out.println("stripOut: " + stripOut);
        System.out.println("trimOut: " + trimOut + ".end");
        assertEquals("hello", stripOut);
        assertEquals("hello   \u2005", trimOut);
    }

    @Test
    void isBlankTest() {
        String input = "\n\t\u2005  ";
        assertTrue(input.isBlank());
    }

    @Test
    void linesTest() {
        String multilineStr = "This is\n \n a multiline\n string.";
        long lineCount = multilineStr.lines().count();
        assertEquals(4L, lineCount);
    }

}