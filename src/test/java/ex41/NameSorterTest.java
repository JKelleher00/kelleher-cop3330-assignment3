package ex41;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
class NameSorterTest {
    @org.junit.jupiter.api.Test
    void a(){
        String[] teststring = {"achoo","zzzz","jacob"};
        NameSorter ns = new NameSorter();
        teststring = ns.nameSort(teststring);
        assertEquals("achoo",teststring[0]);
    }

}