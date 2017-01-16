package com.twopirad.learning;

import static org.junit.Assert.*;


public class RegexTest {
    @org.junit.Test
    public void testRegex() {
        Regex regex = new Regex();
        assertTrue("passed", regex.matchString("123"));
        assertTrue("won't pass", !regex.matchString("^&&^^&"));
    }
}