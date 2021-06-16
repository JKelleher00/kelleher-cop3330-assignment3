package ex46;
import java.util.ArrayList;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {
    @org.junit.jupiter.api.Test
    void a(){
        WordCounter wc = new WordCounter();
        ArrayList a = new ArrayList();
        a.add("achoo");
        a.add("achoo");
        ArrayList b = wc.counter(a);
        assertEquals(":\t**",b.get(1));
    }

}