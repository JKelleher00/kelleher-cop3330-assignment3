package ex42;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
class CSVParserTest {
    @org.junit.jupiter.api.Test
    void a(){
        CSVParser c = new CSVParser();
        String a[] = new String[1];
        a[0] = "Kelleher,John,50000";
        String n[][] = c.parseFile(a);
        assertEquals("Kelleher",n[0][0]);
        assertEquals("John",n[0][1]);
        assertEquals("50000",n[0][2]);
    }

}