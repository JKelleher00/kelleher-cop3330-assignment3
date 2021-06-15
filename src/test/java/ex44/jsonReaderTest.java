package ex44;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
class jsonReaderTest {
    @org.junit.jupiter.api.Test
    void a()throws IOException {
        jsonReader jr = new jsonReader();
        assertEquals("Sorry, that product is not found in our inventory",jr.search("achoo"));
    }
}