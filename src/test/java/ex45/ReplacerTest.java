package ex45;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
class ReplacerTest {
    @org.junit.jupiter.api.Test
    void a()throws IOException {
        Replacer r = new Replacer();
        assertEquals("One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".\n",r.ReadnReplace("utilize","use"));
    }
}